package com.dev.core;

import com.dev.core.exceptions.ClientNotFoundException;
import com.dev.core.exceptions.EmailAlreadyExistsException;
import com.dev.core.exceptions.InvalidUserException;
import com.dev.core.models.Client;
import com.dev.core.repositories.ClientRepository;
import com.dev.core.services.ClientService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * Testes unitários para ClientService.
 *
 * Escopo: lógica pura de cadastro/atualização/remoção/consulta de Client.
 * ClientRepository é mockado.
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("ClientService")
class ClientServiceTest {

    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientService clientService;

    // ---------------------------------------------------------------
    // addClient - caminho feliz
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("addClient - caminho feliz")
    class AddClientHappyPath {

        @Test
        @DisplayName("deve cadastrar cliente novo com sucesso quando email não existe")
        void deveCadastrarClienteComSucesso() {
            UUID id = UUID.randomUUID();
            when(clientRepository.findByEmail("maria@email.com")).thenReturn(Optional.empty());
            when(clientRepository.save(any(Client.class))).thenAnswer(invocation -> invocation.getArgument(0));

            Client criado = clientService.addClient(id, "Maria Souza", "maria@email.com", "11988887777");

            assertThat(criado.getId()).isEqualTo(id);
            assertThat(criado.getName()).isEqualTo("Maria Souza");
            assertThat(criado.getEmail()).isEqualTo("maria@email.com");
            verify(clientRepository, times(1)).save(any(Client.class));
        }

        @Test
        @DisplayName("deve normalizar o email para minúsculas e sem espaços nas pontas")
        void deveNormalizarEmailAoCadastrar() {
            UUID id = UUID.randomUUID();
            when(clientRepository.findByEmail("maria@email.com")).thenReturn(Optional.empty());
            when(clientRepository.save(any(Client.class))).thenAnswer(invocation -> invocation.getArgument(0));

            Client criado = clientService.addClient(id, "Maria Souza", "  MARIA@Email.com ", "11988887777");

            assertThat(criado.getEmail()).isEqualTo("maria@email.com");
        }
    }

    // ---------------------------------------------------------------
    // addClient - validação de campos e duplicidade (casos óbvios)
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("addClient - erros óbvios")
    class AddClientErrosObvios {

        @Test
        @DisplayName("deve lançar InvalidUserException quando nome é vazio")
        void deveLancarExcecaoQuandoNomeEhVazio() {
            UUID id = UUID.randomUUID();

            assertThatThrownBy(() -> clientService.addClient(id, "", "maria@email.com", "11988887777"))
                    .isInstanceOf(InvalidUserException.class);

            verify(clientRepository, never()).save(any(Client.class));
        }

        @Test
        @DisplayName("deve lançar InvalidUserException quando nome é nulo")
        void deveLancarExcecaoQuandoNomeEhNulo() {
            UUID id = UUID.randomUUID();

            assertThatThrownBy(() -> clientService.addClient(id, null, "maria@email.com", "11988887777"))
                    .isInstanceOf(InvalidUserException.class);
        }

        @Test
        @DisplayName("deve lançar InvalidUserException quando email é vazio")
        void deveLancarExcecaoQuandoEmailEhVazio() {
            UUID id = UUID.randomUUID();

            assertThatThrownBy(() -> clientService.addClient(id, "Maria Souza", "", "11988887777"))
                    .isInstanceOf(InvalidUserException.class);

            verify(clientRepository, never()).save(any(Client.class));
        }

        @Test
        @DisplayName("deve lançar EmailAlreadyExistsException quando email já está cadastrado")
        void deveLancarExcecaoQuandoEmailJaExiste() {
            UUID id = UUID.randomUUID();
            when(clientRepository.findByEmail("maria@email.com")).thenReturn(
                    Optional.of(Client.builder().id(UUID.randomUUID()).email("maria@email.com").build())
            );

            assertThatThrownBy(() -> clientService.addClient(id, "Maria Souza", "maria@email.com", "11988887777"))
                    .isInstanceOf(EmailAlreadyExistsException.class);

            verify(clientRepository, never()).save(any(Client.class));
        }
    }

    // ---------------------------------------------------------------
    // addClient - bordas adversariais
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("addClient - bordas")
    class AddClientBordas {

        @Test
        @DisplayName("borda: deve lançar InvalidUserException quando nome é apenas espaços")
        void deveLancarExcecaoQuandoNomeEhApenasEspacos() {
            UUID id = UUID.randomUUID();

            assertThatThrownBy(() -> clientService.addClient(id, "   ", "maria@email.com", "11988887777"))
                    .isInstanceOf(InvalidUserException.class);
        }

        @Test
        @DisplayName("borda: deve lançar InvalidUserException quando email é apenas espaços")
        void deveLancarExcecaoQuandoEmailEhApenasEspacos() {
            UUID id = UUID.randomUUID();

            assertThatThrownBy(() -> clientService.addClient(id, "Maria Souza", "   ", "11988887777"))
                    .isInstanceOf(InvalidUserException.class);
        }

        @Test
        @DisplayName("borda: deve detectar duplicidade mesmo com capitalização e espaços diferentes do email já cadastrado")
        void deveDetectarDuplicidadeComCapitalizacaoEEspacosDiferentes() {
            UUID id = UUID.randomUUID();
            when(clientRepository.findByEmail("maria@email.com")).thenReturn(
                    Optional.of(Client.builder().id(UUID.randomUUID()).email("maria@email.com").build())
            );

            assertThatThrownBy(() -> clientService.addClient(id, "Maria Souza", "  MARIA@EMAIL.COM ", "11988887777"))
                    .isInstanceOf(EmailAlreadyExistsException.class);
        }

        @Test
        @DisplayName("borda: telefone vazio ou nulo não bloqueia o cadastro (campo opcional)")
        void telefoneVazioOuNuloNaoBloqueiaCadastro() {
            UUID id = UUID.randomUUID();
            when(clientRepository.findByEmail("maria@email.com")).thenReturn(Optional.empty());
            when(clientRepository.save(any(Client.class))).thenAnswer(invocation -> invocation.getArgument(0));

            Client criado = clientService.addClient(id, "Maria Souza", "maria@email.com", null);

            assertThat(criado.getPhone()).isNull();
        }
    }

    // ---------------------------------------------------------------
    // getClient
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("getClient")
    class GetClient {

        @Test
        @DisplayName("deve retornar cliente existente pelo id")
        void deveRetornarClienteExistente() {
            UUID id = UUID.randomUUID();
            Client esperado = Client.builder().id(id).email("maria@email.com").build();
            when(clientRepository.findById(id)).thenReturn(Optional.of(esperado));

            Client resultado = clientService.getClient(id);

            assertThat(resultado).isEqualTo(esperado);
        }

        @Test
        @DisplayName("deve lançar ClientNotFoundException para id inexistente (em vez de retornar null)")
        void deveLancarExcecaoParaIdInexistente() {
            UUID id = UUID.randomUUID();
            when(clientRepository.findById(id)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> clientService.getClient(id))
                    .isInstanceOf(ClientNotFoundException.class);
        }
    }

    // ---------------------------------------------------------------
    // updateClient
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("updateClient")
    class UpdateClient {

        @Test
        @DisplayName("deve atualizar cliente existente com sucesso")
        void deveAtualizarClienteExistente() {
            UUID id = UUID.randomUUID();
            Client existente = Client.builder().id(id).name("Nome Antigo").email("antigo@email.com").phone("111").build();

            when(clientRepository.findById(id)).thenReturn(Optional.of(existente));
            when(clientRepository.findByEmail("novo@email.com")).thenReturn(Optional.empty());
            when(clientRepository.save(any(Client.class))).thenAnswer(invocation -> invocation.getArgument(0));

            Client atualizado = clientService.updateClient(id, "Nome Novo", "novo@email.com", "222");

            assertThat(atualizado.getName()).isEqualTo("Nome Novo");
            assertThat(atualizado.getEmail()).isEqualTo("novo@email.com");
            assertThat(atualizado.getPhone()).isEqualTo("222");
        }

        @Test
        @DisplayName("deve lançar ClientNotFoundException ao atualizar cliente inexistente (em vez de retornar null)")
        void deveLancarExcecaoAoAtualizarClienteInexistente() {
            UUID id = UUID.randomUUID();
            when(clientRepository.findById(id)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> clientService.updateClient(id, "Nome", "email@email.com", "123"))
                    .isInstanceOf(ClientNotFoundException.class);

            verify(clientRepository, never()).save(any(Client.class));
        }

        @Test
        @DisplayName("deve lançar EmailAlreadyExistsException quando o novo email já pertence a outro cliente")
        void deveLancarExcecaoQuandoNovoEmailPertenceAOutroCliente() {
            UUID idClienteA = UUID.randomUUID();
            UUID idClienteB = UUID.randomUUID();
            Client clienteA = Client.builder().id(idClienteA).email("a@email.com").build();
            Client clienteB = Client.builder().id(idClienteB).email("b@email.com").build();

            when(clientRepository.findById(idClienteA)).thenReturn(Optional.of(clienteA));
            when(clientRepository.findByEmail("b@email.com")).thenReturn(Optional.of(clienteB));

            assertThatThrownBy(() -> clientService.updateClient(idClienteA, "Nome", "b@email.com", "123"))
                    .isInstanceOf(EmailAlreadyExistsException.class);

            verify(clientRepository, never()).save(any(Client.class));
        }

        @Test
        @DisplayName("borda: não deve lançar exceção quando o cliente mantém o próprio email no update")
        void naoDeveLancarExcecaoAoManterOMesmoEmail() {
            UUID id = UUID.randomUUID();
            Client existente = Client.builder().id(id).name("Nome").email("maria@email.com").build();

            when(clientRepository.findById(id)).thenReturn(Optional.of(existente));
            when(clientRepository.findByEmail("maria@email.com")).thenReturn(Optional.of(existente));
            when(clientRepository.save(any(Client.class))).thenAnswer(invocation -> invocation.getArgument(0));

            Client resultado = clientService.updateClient(id, "Nome Atualizado", "maria@email.com", "999");

            assertThat(resultado.getName()).isEqualTo("Nome Atualizado");
            assertThat(resultado.getEmail()).isEqualTo("maria@email.com");
        }

        @Test
        @DisplayName("deve lançar InvalidUserException ao atualizar com nome vazio")
        void deveLancarExcecaoAoAtualizarComNomeVazio() {
            UUID id = UUID.randomUUID();
            Client existente = Client.builder().id(id).name("Nome").email("maria@email.com").build();
            when(clientRepository.findById(id)).thenReturn(Optional.of(existente));

            assertThatThrownBy(() -> clientService.updateClient(id, "", "maria@email.com", "123"))
                    .isInstanceOf(InvalidUserException.class);

            verify(clientRepository, never()).save(any(Client.class));
        }
    }

    // ---------------------------------------------------------------
    // removeClient
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("removeClient")
    class RemoveClient {

        @Test
        @DisplayName("deve remover cliente existente")
        void deveRemoverClienteExistente() {
            UUID id = UUID.randomUUID();
            when(clientRepository.existsById(id)).thenReturn(true);

            clientService.removeClient(id);

            verify(clientRepository, times(1)).deleteById(id);
        }

        @Test
        @DisplayName("deve lançar ClientNotFoundException ao remover cliente inexistente")
        void deveLancarExcecaoAoRemoverClienteInexistente() {
            UUID id = UUID.randomUUID();
            when(clientRepository.existsById(id)).thenReturn(false);

            assertThatThrownBy(() -> clientService.removeClient(id))
                    .isInstanceOf(ClientNotFoundException.class);

            verify(clientRepository, never()).deleteById(any(UUID.class));
        }

        @Test
        @DisplayName("borda: remover o mesmo cliente duas vezes seguidas deve falhar na segunda vez")
        void removerDuasVezesDeveFalharNaSegunda() {
            UUID id = UUID.randomUUID();
            when(clientRepository.existsById(id)).thenReturn(true, false);

            clientService.removeClient(id);

            assertThatThrownBy(() -> clientService.removeClient(id))
                    .isInstanceOf(ClientNotFoundException.class);

            verify(clientRepository, times(1)).deleteById(id);
        }
    }

    // ---------------------------------------------------------------
    // getAllClients
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("getAllClients")
    class GetAllClients {

        @Test
        @DisplayName("deve retornar lista vazia quando não há clientes cadastrados")
        void deveRetornarListaVaziaQuandoNaoHaClientes() {
            when(clientRepository.findAll()).thenReturn(List.of());

            List<Client> resultado = clientService.getAllClients();

            assertThat(resultado).isEmpty();
        }

        @Test
        @DisplayName("deve retornar todos os clientes cadastrados")
        void deveRetornarTodosOsClientes() {
            Client c1 = Client.builder().id(UUID.randomUUID()).email("a@email.com").build();
            Client c2 = Client.builder().id(UUID.randomUUID()).email("b@email.com").build();
            when(clientRepository.findAll()).thenReturn(List.of(c1, c2));

            List<Client> resultado = clientService.getAllClients();

            assertThat(resultado).hasSize(2).containsExactly(c1, c2);
        }
    }
}