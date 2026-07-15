package com.dev.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.dev.core.dtos.barbershop.AddressDTO;
import com.dev.core.dtos.barbershop.BarbershopRegisterDTO;
import com.dev.core.dtos.barbershop.BarbershopResponseDTO;
import com.dev.core.dtos.barbershop.BarbershopUpdateDTO;
import com.dev.core.exceptions.BarbershopNotFoundException;
import com.dev.core.exceptions.InvalidBarbershopException;
import com.dev.core.mappers.AddressMapper;
import com.dev.core.mappers.BarbershopMapper;
import com.dev.core.models.barbershop.Address;
import com.dev.core.models.barbershop.Barbershop;
import com.dev.core.repositories.BarbershopRepository;
import com.dev.core.services.barbershop.BarbershopService;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Testes unitários para BarbershopService.
 *
 * <p>Técnica: Partição de Equivalência para os campos name/username (válido / nulo / em branco) e
 * Caixa Preta para os fluxos de CRUD.
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("BarbershopService")
class BarbershopServiceTest {

    @Mock private BarbershopRepository repository;

    @Mock private BarbershopMapper barbershopMapper;

    @Mock private AddressMapper addressMapper;

    @InjectMocks private BarbershopService barbershopService;

    private Address buildAddress() {
        return Address.builder()
                .street("Rua A")
                .number(100L)
                .neighborhood("Centro")
                .city("Campina Grande")
                .uf("PB")
                .build();
    }

    private Barbershop buildBarbershop(UUID id) {
        return Barbershop.builder()
                .id(id)
                .name("Barbearia X")
                .username("barbearia-x")
                .location(buildAddress())
                .phone("83999999999")
                .build();
    }

    @Nested
    @DisplayName("registerBarbershop")
    class Register {

        @Test
        @DisplayName("deve registrar quando name e username forem válidos")
        void deveRegistrarQuandoDadosValidos() {
            BarbershopRegisterDTO dto =
                    new BarbershopRegisterDTO("Barbearia X", "barbearia-x", null, null, null, null);
            Barbershop entity = buildBarbershop(null);
            Barbershop salvo = buildBarbershop(UUID.randomUUID());
            BarbershopResponseDTO response =
                    new BarbershopResponseDTO(
                            salvo.getId(), "Barbearia X", "barbearia-x", null, null, null, null);

            when(barbershopMapper.toEntity(dto)).thenReturn(entity);
            when(repository.save(entity)).thenReturn(salvo);
            when(barbershopMapper.toResponse(salvo)).thenReturn(response);

            BarbershopResponseDTO resultado = barbershopService.registerBarbershop(dto);

            assertThat(resultado).isEqualTo(response);
            verify(repository, times(1)).save(entity);
        }

        @ParameterizedTest(name = "deve rejeitar quando name=\"{0}\" e username=\"{1}\"")
        @CsvSource({"'', barbearia-x", "Barbearia X, ''", ",barbearia-x", "Barbearia X,"})
        @DisplayName("deve lançar InvalidBarbershopException para name/username nulos ou em branco")
        void deveLancarExcecaoParaCamposInvalidos(String name, String username) {
            BarbershopRegisterDTO dto =
                    new BarbershopRegisterDTO(name, username, null, null, null, null);

            assertThatThrownBy(() -> barbershopService.registerBarbershop(dto))
                    .isInstanceOf(InvalidBarbershopException.class);

            verify(repository, never()).save(any());
        }
    }

    @Nested
    @DisplayName("getBarbershop / getAllBarbershops")
    class Get {

        @Test
        @DisplayName("deve retornar a barbearia quando o id existir")
        void deveRetornarBarbeariaQuandoIdExistir() {
            UUID id = UUID.randomUUID();
            Barbershop barbershop = buildBarbershop(id);
            BarbershopResponseDTO response =
                    new BarbershopResponseDTO(
                            id, "Barbearia X", "barbearia-x", null, null, null, null);
            when(repository.findById(id)).thenReturn(Optional.of(barbershop));
            when(barbershopMapper.toResponse(barbershop)).thenReturn(response);

            assertThat(barbershopService.getBarbershop(id)).isEqualTo(response);
        }

        @Test
        @DisplayName("deve lançar BarbershopNotFoundException quando o id não existir")
        void deveLancarExcecaoQuandoIdNaoExistir() {
            UUID id = UUID.randomUUID();
            when(repository.findById(id)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> barbershopService.getBarbershop(id))
                    .isInstanceOf(BarbershopNotFoundException.class);
        }

        @Test
        @DisplayName("deve retornar lista vazia quando não houver barbearias cadastradas")
        void deveRetornarListaVaziaQuandoNaoHouverBarbearias() {
            when(repository.findAll()).thenReturn(List.of());

            assertThat(barbershopService.getAllBarbershops()).isEmpty();
        }
    }

    @Nested
    @DisplayName("updateBarbershop")
    class Update {

        @Test
        @DisplayName("deve atualizar nome, username e endereço quando os dados forem válidos")
        void deveAtualizarQuandoDadosValidos() {
            UUID id = UUID.randomUUID();
            Barbershop existente = buildBarbershop(id);
            AddressDTO novoEnderecoDto =
                    new AddressDTO("Rua Nova", 200L, "Bairro Novo", "João Pessoa", "PB");
            Address novoEndereco =
                    Address.builder()
                            .street("Rua Nova")
                            .number(200L)
                            .neighborhood("Bairro Novo")
                            .city("João Pessoa")
                            .uf("PB")
                            .build();
            BarbershopUpdateDTO dto =
                    new BarbershopUpdateDTO(
                            "Barbearia Y", "barbearia-y", novoEnderecoDto, "83988888888");
            BarbershopResponseDTO response =
                    new BarbershopResponseDTO(
                            id, "Barbearia Y", "barbearia-y", null, null, null, null);

            when(repository.findById(id)).thenReturn(Optional.of(existente));
            when(addressMapper.toEntity(novoEnderecoDto)).thenReturn(novoEndereco);
            when(barbershopMapper.toResponse(existente)).thenReturn(response);

            BarbershopResponseDTO resultado = barbershopService.updateBarbershop(id, dto);

            assertThat(resultado).isEqualTo(response);
            assertThat(existente.getName()).isEqualTo("Barbearia Y");
            assertThat(existente.getUsername()).isEqualTo("barbearia-y");
            assertThat(existente.getLocation().getStreet()).isEqualTo("Rua Nova");
            assertThat(existente.getLocation().getCity()).isEqualTo("João Pessoa");
            verify(repository, times(1)).save(existente);
        }

        @Test
        @DisplayName("deve lançar BarbershopNotFoundException ao atualizar id inexistente")
        void deveLancarExcecaoAoAtualizarIdInexistente() {
            UUID id = UUID.randomUUID();
            when(repository.findById(id)).thenReturn(Optional.empty());
            BarbershopUpdateDTO dto = new BarbershopUpdateDTO("Nome", "user", null, null);

            assertThatThrownBy(() -> barbershopService.updateBarbershop(id, dto))
                    .isInstanceOf(BarbershopNotFoundException.class);
        }

        @Test
        @DisplayName(
                "deve lançar InvalidBarbershopException quando o username informado for em branco")
        void deveLancarExcecaoQuandoUsernameEmBranco() {
            UUID id = UUID.randomUUID();
            when(repository.findById(id)).thenReturn(Optional.of(buildBarbershop(id)));
            BarbershopUpdateDTO dto = new BarbershopUpdateDTO("Nome válido", "  ", null, null);

            assertThatThrownBy(() -> barbershopService.updateBarbershop(id, dto))
                    .isInstanceOf(InvalidBarbershopException.class);

            verify(repository, never()).save(any());
        }
    }

    @Nested
    @DisplayName("deleteBarbershop")
    class Delete {

        @Test
        @DisplayName("deve deletar e retornar os dados da barbearia removida")
        void deveDeletarERetornarDadosRemovidos() {
            UUID id = UUID.randomUUID();
            Barbershop barbershop = buildBarbershop(id);
            BarbershopResponseDTO response =
                    new BarbershopResponseDTO(
                            id, "Barbearia X", "barbearia-x", null, null, null, null);
            when(repository.findById(id)).thenReturn(Optional.of(barbershop));
            when(barbershopMapper.toResponse(barbershop)).thenReturn(response);

            BarbershopResponseDTO resultado = barbershopService.deleteBarbershop(id);

            assertThat(resultado).isEqualTo(response);
            verify(repository, times(1)).deleteById(id);
        }

        @Test
        @DisplayName("deve lançar BarbershopNotFoundException ao deletar id inexistente")
        void deveLancarExcecaoAoDeletarIdInexistente() {
            UUID id = UUID.randomUUID();
            when(repository.findById(id)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> barbershopService.deleteBarbershop(id))
                    .isInstanceOf(BarbershopNotFoundException.class);

            verify(repository, never()).deleteById(any());
        }
    }
}
