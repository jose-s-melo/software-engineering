package com.dev.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.dev.core.dtos.ChangePasswordRequestDTO;
import com.dev.core.dtos.ConfirmForgotPasswordRequestDTO;
import com.dev.core.dtos.ForgotPasswordRequestDTO;
import com.dev.core.dtos.LoginRequestDTO;
import com.dev.core.dtos.RegisterRequestDTO;
import com.dev.core.dtos.TokenResponseDTO;
import com.dev.core.dtos.UserResponseDTO;
import com.dev.core.models.ForgotPasswordEntity;
import com.dev.core.models.user.User;
import com.dev.core.models.user.UserRole;
import com.dev.core.repositories.ForgotPasswordEntityRepository;
import com.dev.core.services.AuthService;
import com.dev.core.services.TokenService;
import com.dev.core.services.UserService;
import com.dev.core.services.email.EmailService;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

/**
 * Testes unitários para AuthService.
 *
 * <p>Técnica: Caixa Branca (o comportamento interno de invalidateCodes() e da geração do código
 * aleatório é conhecido e exercitado deliberadamente). Dependências (AuthenticationManager,
 * TokenService, UserService, EmailService, ForgotPasswordEntityRepository) são mockadas com Mockito
 * para isolar a unidade.
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("AuthService")
class AuthServiceTest {

    @Mock private AuthenticationManager authenticationManager;

    @Mock private TokenService tokenService;

    @Mock private UserService userService;

    @Mock private EmailService emailService;

    @Mock private ForgotPasswordEntityRepository forgotPasswordEntityRepository;

    @InjectMocks private AuthService authService;

    private User buildUser() {
        return User.builder()
                .id(UUID.randomUUID())
                .name("Cliente Teste")
                .email("cliente@email.com")
                .password("HASH")
                .role(UserRole.CLIENTE)
                .build();
    }

    @Nested
    @DisplayName("login")
    class Login {

        @Test
        @DisplayName("deve autenticar e retornar TokenResponseDTO com token gerado")
        void deveAutenticarERetornarToken() {
            User user = buildUser();
            Authentication authentication = mock(Authentication.class);
            when(authentication.getPrincipal()).thenReturn(user);
            when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class)))
                    .thenReturn(authentication);
            when(tokenService.generateToken(user)).thenReturn("jwt-fake-token");

            TokenResponseDTO response =
                    authService.login(new LoginRequestDTO("cliente@email.com", "12345678"));

            assertThat(response.token()).isEqualTo("jwt-fake-token");
            assertThat(response.message()).isEqualTo("Success");
            assertThat(response.dto().email()).isEqualTo("cliente@email.com");
        }

        @Test
        @DisplayName("deve propagar exceção quando o AuthenticationManager rejeitar as credenciais")
        void devePropagarExcecaoDeCredenciaisInvalidas() {
            when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class)))
                    .thenThrow(
                            new org.springframework.security.authentication.BadCredentialsException(
                                    "Credenciais inválidas"));

            assertThatThrownBy(
                            () ->
                                    authService.login(
                                            new LoginRequestDTO("cliente@email.com", "errada")))
                    .isInstanceOf(
                            org.springframework.security.authentication.BadCredentialsException
                                    .class);
        }
    }

    @Nested
    @DisplayName("register")
    class Register {

        @Test
        @DisplayName("deve delegar o registro para UserService.addUser")
        void deveDelegarRegistroParaUserService() {
            RegisterRequestDTO dto =
                    new RegisterRequestDTO(
                            "Novo Usuário", "novo@email.com", "12345678", "83999999999");

            authService.register(dto);

            verify(userService, times(1)).addUser(dto);
        }
    }

    @Nested
    @DisplayName("changePassword")
    class ChangePassword {

        @Test
        @DisplayName("deve delegar a troca de senha para UserService.changePassword")
        void deveDelegarParaUserService() {
            ChangePasswordRequestDTO dto =
                    new ChangePasswordRequestDTO("antiga", "nova12345", "cliente@email.com");
            UserResponseDTO esperado =
                    new UserResponseDTO(UUID.randomUUID(), "cliente@email.com", UserRole.CLIENTE);
            when(userService.changePassword(dto)).thenReturn(esperado);

            UserResponseDTO resultado = authService.changePassword(dto);

            assertThat(resultado).isEqualTo(esperado);
        }
    }

    @Nested
    @DisplayName("forgotPassword")
    class ForgotPassword {

        @Test
        @DisplayName("deve gerar código de 4 dígitos, enviar e-mail e salvar o registro")
        void deveGerarCodigoEnviarEmailESalvar() {
            when(forgotPasswordEntityRepository.findAll()).thenReturn(List.of());

            authService.forgotPassword(new ForgotPasswordRequestDTO("cliente@email.com"));

            verify(emailService, times(1)).sendEmail(any());
            ArgumentCaptor<ForgotPasswordEntity> captor =
                    ArgumentCaptor.forClass(ForgotPasswordEntity.class);
            verify(forgotPasswordEntityRepository, times(1)).save(captor.capture());

            ForgotPasswordEntity salvo = captor.getValue();
            assertThat(salvo.getEmail()).isEqualTo("cliente@email.com");
            assertThat(salvo.getCode()).hasSize(4);
            assertThat(salvo.getCode()).containsOnlyDigits();
        }

        @Test
        @DisplayName(
                "deve invalidar (remover) códigos com mais de 2 minutos antes de gerar um novo")
        void deveInvalidarCodigosExpirados() {
            ForgotPasswordEntity expirado =
                    ForgotPasswordEntity.builder()
                            .id(UUID.randomUUID())
                            .email("outro@email.com")
                            .code("1234")
                            .createdAt(Instant.now().minusSeconds(180)) // 3 minutos atrás
                            .build();
            when(forgotPasswordEntityRepository.findAll()).thenReturn(List.of(expirado));

            authService.forgotPassword(new ForgotPasswordRequestDTO("cliente@email.com"));

            verify(forgotPasswordEntityRepository, times(1)).deleteById(expirado.getId());
        }

        @Test
        @DisplayName("não deve invalidar códigos com menos de 2 minutos")
        void naoDeveInvalidarCodigosRecentes() {
            ForgotPasswordEntity recente =
                    ForgotPasswordEntity.builder()
                            .id(UUID.randomUUID())
                            .email("outro@email.com")
                            .code("1234")
                            .createdAt(Instant.now().minusSeconds(30)) // 30s atrás
                            .build();
            when(forgotPasswordEntityRepository.findAll()).thenReturn(List.of(recente));

            authService.forgotPassword(new ForgotPasswordRequestDTO("cliente@email.com"));

            verify(forgotPasswordEntityRepository, never()).deleteById(recente.getId());
        }
    }

    @Nested
    @DisplayName("confirmForgotPassword")
    class ConfirmForgotPassword {

        @Test
        @DisplayName("deve trocar a senha quando o código estiver correto e remover o registro")
        void deveTrocarSenhaQuandoCodigoCorreto() {
            UUID id = UUID.randomUUID();
            ForgotPasswordEntity entity =
                    ForgotPasswordEntity.builder()
                            .id(id)
                            .email("cliente@email.com")
                            .code("1234")
                            .createdAt(Instant.now())
                            .build();
            when(forgotPasswordEntityRepository.findAll()).thenReturn(List.of());
            when(forgotPasswordEntityRepository.findByEmail("cliente@email.com"))
                    .thenReturn(Optional.of(entity));

            authService.confirmForgotPassword(
                    new ConfirmForgotPasswordRequestDTO(
                            "cliente@email.com", "1234", "novaSenha123"));

            verify(userService, times(1)).changeForgotPassword("cliente@email.com", "novaSenha123");
            verify(forgotPasswordEntityRepository, times(1)).deleteById(id);
        }

        @Test
        @DisplayName("deve lançar exceção quando o código informado for diferente do salvo")
        void deveLancarExcecaoQuandoCodigoInvalido() {
            ForgotPasswordEntity entity =
                    ForgotPasswordEntity.builder()
                            .id(UUID.randomUUID())
                            .email("cliente@email.com")
                            .code("1234")
                            .createdAt(Instant.now())
                            .build();
            when(forgotPasswordEntityRepository.findAll()).thenReturn(List.of());
            when(forgotPasswordEntityRepository.findByEmail("cliente@email.com"))
                    .thenReturn(Optional.of(entity));

            assertThatThrownBy(
                            () ->
                                    authService.confirmForgotPassword(
                                            new ConfirmForgotPasswordRequestDTO(
                                                    "cliente@email.com", "0000", "novaSenha123")))
                    .isInstanceOf(RuntimeException.class)
                    .hasMessageContaining("Código inválido");

            verify(userService, never()).changeForgotPassword(anyString(), anyString());
        }

        @Test
        @DisplayName("deve lançar exceção quando não existir código para o e-mail informado")
        void deveLancarExcecaoQuandoEmailSemCodigo() {
            when(forgotPasswordEntityRepository.findAll()).thenReturn(List.of());
            when(forgotPasswordEntityRepository.findByEmail("semcodigo@email.com"))
                    .thenReturn(Optional.empty());

            assertThatThrownBy(
                            () ->
                                    authService.confirmForgotPassword(
                                            new ConfirmForgotPasswordRequestDTO(
                                                    "semcodigo@email.com", "1234", "novaSenha123")))
                    .isInstanceOf(RuntimeException.class);
        }
    }
}
