package com.dev.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import com.dev.core.dtos.RegisterRequestDTO;
import com.dev.core.exceptions.EmailAlreadyExistsException;
import com.dev.core.exceptions.InvalidUserException;
import com.dev.core.exceptions.UserNotFoundException;
import com.dev.core.models.user.User;
import com.dev.core.models.user.UserRole;
import com.dev.core.repositories.UserRepository;
import com.dev.core.services.UserService;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Testes unitários para UserService.
 *
 * Escopo: lógica pura de cadastro/atualização/remoção de usuário. UserRepository e
 * PasswordEncoder são mockados.
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("UserService")
class UserServiceTest {

    @Mock private UserRepository userRepository;

    @Mock private PasswordEncoder encoder;

    @InjectMocks private UserService userService;

    private RegisterRequestDTO validRegisterDTO;

    @BeforeEach
    void setUp() {
        validRegisterDTO =
                new RegisterRequestDTO(
                        "João da Silva", "joao@email.com", "senha123", "11999998888");
    }

    // ---------------------------------------------------------------
    // addUser - caminho feliz
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("addUser - caminho feliz")
    class AddUserHappyPath {

        @Test
        @DisplayName("deve cadastrar usuário novo com sucesso quando email não existe")
        void deveCadastrarUsuarioComSucesso() {
            when(userRepository.findByEmail("joao@email.com")).thenReturn(Optional.empty());
            when(encoder.encode(validRegisterDTO.password())).thenReturn("HASH_FAKE");
            when(userRepository.save(any(User.class)))
                    .thenAnswer(invocation -> invocation.getArgument(0));

            User criado = userService.addUser(validRegisterDTO);

            assertThat(criado).isNotNull();
            assertThat(criado.getName()).isEqualTo("João da Silva");
            assertThat(criado.getEmail()).isEqualTo("joao@email.com");
            assertThat(criado.getPhone()).isEqualTo("11999998888");
            verify(userRepository, times(1)).save(any(User.class));
        }

        @Test
        @DisplayName("usuário cadastrado via register deve sempre receber role CLIENTE")
        void usuarioCadastradoDeveSerSempreCliente() {
            when(userRepository.findByEmail(anyString())).thenReturn(Optional.empty());
            when(encoder.encode(anyString())).thenReturn("HASH_FAKE");
            when(userRepository.save(any(User.class)))
                    .thenAnswer(invocation -> invocation.getArgument(0));

            User criado = userService.addUser(validRegisterDTO);

            assertThat(criado.getRole()).isEqualTo(UserRole.CLIENTE);
        }

        @Test
        @DisplayName("a senha persistida nunca deve ser o texto puro original")
        void senhaDevePassarPeloEncoder() {
            when(userRepository.findByEmail(anyString())).thenReturn(Optional.empty());
            when(encoder.encode("senha123")).thenReturn("$2a$10$HASHDIFERENTE");
            when(userRepository.save(any(User.class)))
                    .thenAnswer(invocation -> invocation.getArgument(0));

            User criado = userService.addUser(validRegisterDTO);

            verify(encoder, times(1)).encode("senha123");
            assertThat(criado.getPassword())
                    .isNotEqualTo("senha123")
                    .isEqualTo("$2a$10$HASHDIFERENTE");
        }
    }

    // ---------------------------------------------------------------
    // addUser - erros óbvios
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("addUser - erros óbvios")
    class AddUserErrosObvios {

        @Test
        @DisplayName("deve lançar EmailAlreadyExistsException quando email já está cadastrado")
        void deveLancarExcecaoQuandoEmailJaExiste() {
            when(userRepository.findByEmail("joao@email.com"))
                    .thenReturn(
                            Optional.of(
                                    User.builder()
                                            .id(UUID.randomUUID())
                                            .email("joao@email.com")
                                            .build()));

            assertThatThrownBy(() -> userService.addUser(validRegisterDTO))
                    .isInstanceOf(EmailAlreadyExistsException.class);

            verify(userRepository, never()).save(any(User.class));
            verify(encoder, never()).encode(anyString());
        }
    }

    // ---------------------------------------------------------------
    // addUser - bordas de normalização de email
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("addUser - bordas de normalização de email")
    class AddUserBordas {

        @Test
        @DisplayName(
                "borda: deve normalizar email com letras maiúsculas para minúsculas antes de salvar")
        void deveNormalizarEmailMaiusculoParaMinusculo() {
            RegisterRequestDTO dtoComEmailMaiusculo =
                    new RegisterRequestDTO(
                            "João da Silva", "JOAO@EMAIL.COM", "senha123", "11999998888");
            when(userRepository.findByEmail("joao@email.com")).thenReturn(Optional.empty());
            when(encoder.encode(anyString())).thenReturn("HASH_FAKE");
            when(userRepository.save(any(User.class)))
                    .thenAnswer(invocation -> invocation.getArgument(0));

            User criado = userService.addUser(dtoComEmailMaiusculo);

            assertThat(criado.getEmail()).isEqualTo("joao@email.com");
        }

        @Test
        @DisplayName(
                "borda: deve detectar duplicidade mesmo com capitalização diferente do email já cadastrado")
        void deveDetectarDuplicidadeComCapitalizacaoDiferente() {
            RegisterRequestDTO dtoComEmailMaiusculo =
                    new RegisterRequestDTO(
                            "João da Silva", "JOAO@EMAIL.COM", "senha123", "11999998888");
            when(userRepository.findByEmail("joao@email.com"))
                    .thenReturn(
                            Optional.of(
                                    User.builder()
                                            .id(UUID.randomUUID())
                                            .email("joao@email.com")
                                            .build()));

            assertThatThrownBy(() -> userService.addUser(dtoComEmailMaiusculo))
                    .isInstanceOf(EmailAlreadyExistsException.class);

            verify(userRepository, never()).save(any(User.class));
        }

        @Test
        @DisplayName(
                "borda: deve remover espaços nas pontas do email antes de checar duplicidade e salvar")
        void deveRemoverEspacosNasPontasDoEmail() {
            RegisterRequestDTO dtoComEspaco =
                    new RegisterRequestDTO(
                            "João da Silva", "  joao@email.com  ", "senha123", "11999998888");
            when(userRepository.findByEmail("joao@email.com")).thenReturn(Optional.empty());
            when(encoder.encode(anyString())).thenReturn("HASH_FAKE");
            when(userRepository.save(any(User.class)))
                    .thenAnswer(invocation -> invocation.getArgument(0));

            User criado = userService.addUser(dtoComEspaco);

            assertThat(criado.getEmail()).isEqualTo("joao@email.com");
        }

        @Test
        @DisplayName(
                "borda: não deve permitir burlar a duplicidade combinando espaço e capitalização diferentes")
        void naoDevePermitirBurlarDuplicidadeComEspacoECapitalizacao() {
            RegisterRequestDTO dtoTentandoBurlar =
                    new RegisterRequestDTO(
                            "João da Silva", "  JOAO@Email.Com ", "senha123", "11999998888");
            when(userRepository.findByEmail("joao@email.com"))
                    .thenReturn(
                            Optional.of(
                                    User.builder()
                                            .id(UUID.randomUUID())
                                            .email("joao@email.com")
                                            .build()));

            assertThatThrownBy(() -> userService.addUser(dtoTentandoBurlar))
                    .isInstanceOf(EmailAlreadyExistsException.class);
        }
    }

    // ---------------------------------------------------------------
    // updateUser
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("updateUser")
    class UpdateUser {

        @Test
        @DisplayName("deve atualizar email e senha de um usuário existente")
        void deveAtualizarUsuarioExistente() {
            UUID id = UUID.randomUUID();
            User existente =
                    User.builder().id(id).email("antigo@email.com").password("HASH_ANTIGO").build();

            when(userRepository.findById(id)).thenReturn(Optional.of(existente));
            when(userRepository.findByEmail("novo@email.com")).thenReturn(Optional.empty());
            when(encoder.encode("novaSenha123")).thenReturn("HASH_NOVO");
            when(userRepository.save(any(User.class)))
                    .thenAnswer(invocation -> invocation.getArgument(0));

            User atualizado = userService.updateUser(id, "novo@email.com", "novaSenha123");

            assertThat(atualizado.getEmail()).isEqualTo("novo@email.com");
            assertThat(atualizado.getPassword()).isEqualTo("HASH_NOVO");
        }

        @Test
        @DisplayName("deve lançar UserNotFoundException ao atualizar usuário inexistente")
        void deveLancarExcecaoAoAtualizarUsuarioInexistente() {
            UUID idInexistente = UUID.randomUUID();
            when(userRepository.findById(idInexistente)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> userService.updateUser(idInexistente, "x@x.com", "123456"))
                    .isInstanceOf(UserNotFoundException.class);

            verify(userRepository, never()).save(any(User.class));
        }

        @Test
        @DisplayName(
                "deve lançar EmailAlreadyExistsException quando o novo email já pertence a outro usuário")
        void deveLancarExcecaoQuandoNovoEmailPertenceAOutroUsuario() {
            UUID idUsuarioA = UUID.randomUUID();
            UUID idUsuarioB = UUID.randomUUID();
            User usuarioA = User.builder().id(idUsuarioA).email("a@email.com").build();
            User usuarioB = User.builder().id(idUsuarioB).email("b@email.com").build();

            when(userRepository.findById(idUsuarioA)).thenReturn(Optional.of(usuarioA));
            when(userRepository.findByEmail("b@email.com")).thenReturn(Optional.of(usuarioB));

            assertThatThrownBy(
                            () -> userService.updateUser(idUsuarioA, "b@email.com", "outraSenha"))
                    .isInstanceOf(EmailAlreadyExistsException.class);

            verify(userRepository, never()).save(any(User.class));
        }

        @Test
        @DisplayName("deve lançar InvalidUserException quando o email informado é vazio")
        void deveLancarExcecaoQuandoEmailEhVazio() {
            UUID id = UUID.randomUUID();
            User existente = User.builder().id(id).email("antigo@email.com").build();
            when(userRepository.findById(id)).thenReturn(Optional.of(existente));

            assertThatThrownBy(() -> userService.updateUser(id, "", "senha123"))
                    .isInstanceOf(InvalidUserException.class);

            verify(userRepository, never()).save(any(User.class));
        }

        @Test
        @DisplayName(
                "borda: não deve lançar exceção quando o usuário atualiza o email para o mesmo email que já possui")
        void naoDeveLancarExcecaoAoManterOMesmoEmail() {
            UUID id = UUID.randomUUID();
            User existente =
                    User.builder().id(id).email("joao@email.com").password("HASH_ANTIGO").build();

            when(userRepository.findById(id)).thenReturn(Optional.of(existente));
            when(userRepository.findByEmail("joao@email.com")).thenReturn(Optional.of(existente));
            when(encoder.encode(anyString())).thenReturn("HASH_NOVO");
            when(userRepository.save(any(User.class)))
                    .thenAnswer(invocation -> invocation.getArgument(0));

            User resultado = userService.updateUser(id, "joao@email.com", "novaSenha");

            assertThat(resultado.getEmail()).isEqualTo("joao@email.com");
        }

        @Test
        @DisplayName(
                "borda: deve lançar InvalidUserException quando o email informado é apenas espaços")
        void deveLancarExcecaoQuandoEmailEhApenasEspacos() {
            UUID id = UUID.randomUUID();
            User existente = User.builder().id(id).email("antigo@email.com").build();
            when(userRepository.findById(id)).thenReturn(Optional.of(existente));

            assertThatThrownBy(() -> userService.updateUser(id, "   ", "senha123"))
                    .isInstanceOf(InvalidUserException.class);

            verify(userRepository, never()).save(any(User.class));
        }

        @Test
        @DisplayName(
                "borda: deve normalizar o novo email (maiúsculo/espaços) antes de salvar no update")
        void deveNormalizarNovoEmailNoUpdate() {
            UUID id = UUID.randomUUID();
            User existente = User.builder().id(id).email("antigo@email.com").build();

            when(userRepository.findById(id)).thenReturn(Optional.of(existente));
            when(userRepository.findByEmail("novo@email.com")).thenReturn(Optional.empty());
            when(encoder.encode(anyString())).thenReturn("HASH");
            when(userRepository.save(any(User.class)))
                    .thenAnswer(invocation -> invocation.getArgument(0));

            User resultado = userService.updateUser(id, "  NOVO@Email.com ", "senha123");

            assertThat(resultado.getEmail()).isEqualTo("novo@email.com");
        }
    }

    // ---------------------------------------------------------------
    // deleteUser
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("deleteUser")
    class DeleteUser {

        @Test
        @DisplayName("deve deletar usuário existente")
        void deveDeletarUsuarioExistente() {
            UUID id = UUID.randomUUID();
            when(userRepository.existsById(id)).thenReturn(true);

            userService.deleteUser(id);

            verify(userRepository, times(1)).deleteById(id);
        }

        @Test
        @DisplayName("deve lançar UserNotFoundException ao deletar usuário inexistente")
        void deveLancarExcecaoAoDeletarUsuarioInexistente() {
            UUID id = UUID.randomUUID();
            when(userRepository.existsById(id)).thenReturn(false);

            assertThatThrownBy(() -> userService.deleteUser(id))
                    .isInstanceOf(UserNotFoundException.class);

            verify(userRepository, never()).deleteById(any(UUID.class));
        }

        @Test
        @DisplayName(
                "borda: chamar deleteUser duas vezes seguidas para o mesmo id deve falhar na segunda vez")
        void deletarDuasVezesDeveFalharNaSegunda() {
            UUID id = UUID.randomUUID();
            when(userRepository.existsById(id)).thenReturn(true, false);

            userService.deleteUser(id);

            assertThatThrownBy(() -> userService.deleteUser(id))
                    .isInstanceOf(UserNotFoundException.class);

            verify(userRepository, times(1)).deleteById(id);
        }
    }

    // ---------------------------------------------------------------
    // getUser
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("getUser")
    class GetUser {

        @Test
        @DisplayName("deve retornar usuário existente pelo id")
        void deveRetornarUsuarioExistente() {
            UUID id = UUID.randomUUID();
            User esperado = User.builder().id(id).email("joao@email.com").build();
            when(userRepository.findById(id)).thenReturn(Optional.of(esperado));

            User resultado = userService.getUser(id);

            assertThat(resultado).isEqualTo(esperado);
        }

        @Test
        @DisplayName("deve lançar UserNotFoundException para id inexistente")
        void deveLancarExcecaoParaIdInexistente() {
            UUID id = UUID.randomUUID();
            when(userRepository.findById(id)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> userService.getUser(id))
                    .isInstanceOf(UserNotFoundException.class)
                    .hasMessage("Usuário não encontrado.");
        }

        @Test
        @DisplayName("borda: getUser com id nulo propaga IllegalArgumentException do Spring Data")
        void getUserComIdNuloDeveLancarExcecao() {
            when(userRepository.findById(null))
                    .thenThrow(new IllegalArgumentException("The given id must not be null"));

            assertThatThrownBy(() -> userService.getUser(null))
                    .isInstanceOf(IllegalArgumentException.class);
        }
    }
}
