package com.dev.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.dev.core.dtos.serviceoffering.ServiceOfferingCreateDTO;
import com.dev.core.dtos.serviceoffering.ServiceOfferingResponseDTO;
import com.dev.core.dtos.serviceoffering.ServiceOfferingUpdateDTO;
import com.dev.core.exceptions.BarbershopNotFoundException;
import com.dev.core.exceptions.InvalidServiceOfferingException;
import com.dev.core.exceptions.ServiceOfferingAlreadyExistsException;
import com.dev.core.exceptions.ServiceOfferingNotFoundException;
import com.dev.core.mappers.ServiceOfferingMapper;
import com.dev.core.models.barbershop.Barbershop;
import com.dev.core.models.serviceoffering.ServiceOffering;
import com.dev.core.repositories.BarbershopRepository;
import com.dev.core.repositories.ServiceOfferingRepository;
import com.dev.core.services.serviceoffering.ServiceOfferingService;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Testes unitários para ServiceOfferingService.
 *
 * Técnica: Tabela de Decisão para create() (barbearia existe? nome duplicado? dados válidos?) e
 * Partição de Equivalência para os campos obrigatórios (name/category/price) em validateParams.
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("ServiceOfferingService")
class ServiceOfferingServiceTest {

    @Mock private ServiceOfferingRepository repository;

    @Mock private BarbershopRepository barbershopRepository;

    @Mock private ServiceOfferingMapper mapper;

    @InjectMocks private ServiceOfferingService service;

    private Barbershop buildBarbershop(UUID id) {
        return Barbershop.builder().id(id).name("Barbearia X").username("barbearia-x").build();
    }

    private ServiceOffering buildOffering(UUID id, String name) {
        return ServiceOffering.builder()
                .id(id)
                .name(name)
                .category("Cabelo")
                .price(new BigDecimal("25.00"))
                .active(true)
                .build();
    }

    @Nested
    @DisplayName("create")
    class Create {

        @Test
        @DisplayName("deve criar o serviço quando a barbearia existir e o nome for único")
        void deveCriarQuandoBarbeariaExisteENomeUnico() {
            UUID barbershopId = UUID.randomUUID();
            ServiceOfferingCreateDTO dto =
                    new ServiceOfferingCreateDTO(
                            "Corte", "Cabelo", "desc", new BigDecimal("25.00"), null);
            Barbershop barbershop = buildBarbershop(barbershopId);
            ServiceOffering entity = buildOffering(null, "Corte");
            ServiceOfferingResponseDTO response =
                    new ServiceOfferingResponseDTO(
                            UUID.randomUUID(),
                            "Corte",
                            "Cabelo",
                            "desc",
                            new BigDecimal("25.00"),
                            true);

            when(barbershopRepository.findById(barbershopId)).thenReturn(Optional.of(barbershop));
            when(repository.existsByNameAndBarbershopId("Corte", barbershopId)).thenReturn(false);
            when(mapper.toEntity(dto)).thenReturn(entity);
            when(mapper.toResponse(entity)).thenReturn(response);

            ServiceOfferingResponseDTO resultado = service.create(barbershopId, dto);

            assertThat(resultado).isEqualTo(response);
            assertThat(entity.getBarbershop()).isEqualTo(barbershop);
            verify(repository, times(1)).save(entity);
        }

        @Test
        @DisplayName("deve lançar BarbershopNotFoundException quando a barbearia não existir")
        void deveLancarExcecaoQuandoBarbeariaNaoExistir() {
            UUID barbershopId = UUID.randomUUID();
            ServiceOfferingCreateDTO dto =
                    new ServiceOfferingCreateDTO(
                            "Corte", "Cabelo", "desc", new BigDecimal("25.00"), null);
            when(barbershopRepository.findById(barbershopId)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> service.create(barbershopId, dto))
                    .isInstanceOf(BarbershopNotFoundException.class);

            verify(repository, never()).save(any());
        }

        @Test
        @DisplayName(
                "deve lançar InvalidServiceOfferingException quando já existir serviço com o mesmo nome na barbearia")
        void deveLancarExcecaoQuandoNomeDuplicado() {
            UUID barbershopId = UUID.randomUUID();
            ServiceOfferingCreateDTO dto =
                    new ServiceOfferingCreateDTO(
                            "Corte", "Cabelo", "desc", new BigDecimal("25.00"), null);
            when(barbershopRepository.findById(barbershopId))
                    .thenReturn(Optional.of(buildBarbershop(barbershopId)));
            when(repository.existsByNameAndBarbershopId("Corte", barbershopId)).thenReturn(true);

            assertThatThrownBy(() -> service.create(barbershopId, dto))
                    .isInstanceOf(InvalidServiceOfferingException.class);
        }

        @Test
        @DisplayName("deve lançar InvalidServiceOfferingException quando o nome for em branco")
        void deveLancarExcecaoQuandoNomeEmBranco() {
            ServiceOfferingCreateDTO dto =
                    new ServiceOfferingCreateDTO(
                            " ", "Cabelo", "desc", new BigDecimal("25.00"), null);

            assertThatThrownBy(() -> service.create(UUID.randomUUID(), dto))
                    .isInstanceOf(InvalidServiceOfferingException.class);

            verify(barbershopRepository, never()).findById(any());
        }

        @Test
        @DisplayName(
                "deve lançar InvalidServiceOfferingException quando o preço for zero ou negativo")
        void deveLancarExcecaoQuandoPrecoInvalido() {
            ServiceOfferingCreateDTO dto =
                    new ServiceOfferingCreateDTO("Corte", "Cabelo", "desc", BigDecimal.ZERO, null);

            assertThatThrownBy(() -> service.create(UUID.randomUUID(), dto))
                    .isInstanceOf(InvalidServiceOfferingException.class);
        }

        @Test
        @DisplayName("deve lançar InvalidServiceOfferingException quando a categoria for nula")
        void deveLancarExcecaoQuandoCategoriaNula() {
            ServiceOfferingCreateDTO dto =
                    new ServiceOfferingCreateDTO(
                            "Corte", null, "desc", new BigDecimal("25.00"), null);

            assertThatThrownBy(() -> service.create(UUID.randomUUID(), dto))
                    .isInstanceOf(InvalidServiceOfferingException.class);
        }
    }

    @Nested
    @DisplayName("searchById / findAll")
    class Search {

        @Test
        @DisplayName("deve retornar o serviço quando existir para a barbearia informada")
        void deveRetornarServicoQuandoExistir() {
            UUID barbershopId = UUID.randomUUID();
            UUID serviceId = UUID.randomUUID();
            ServiceOffering entity = buildOffering(serviceId, "Corte");
            ServiceOfferingResponseDTO response =
                    new ServiceOfferingResponseDTO(
                            serviceId, "Corte", "Cabelo", null, new BigDecimal("25.00"), true);
            when(repository.findByIdAndBarbershopId(serviceId, barbershopId))
                    .thenReturn(Optional.of(entity));
            when(mapper.toResponse(entity)).thenReturn(response);

            assertThat(service.searchById(barbershopId, serviceId)).isEqualTo(response);
        }

        @Test
        @DisplayName(
                "deve lançar ServiceOfferingNotFoundException quando o serviço não pertencer à barbearia")
        void deveLancarExcecaoQuandoServicoNaoPertenceABarbearia() {
            UUID barbershopId = UUID.randomUUID();
            UUID serviceId = UUID.randomUUID();
            when(repository.findByIdAndBarbershopId(serviceId, barbershopId))
                    .thenReturn(Optional.empty());

            assertThatThrownBy(() -> service.searchById(barbershopId, serviceId))
                    .isInstanceOf(ServiceOfferingNotFoundException.class);
        }

        @Test
        @DisplayName("deve retornar lista vazia quando a barbearia não tiver serviços cadastrados")
        void deveRetornarListaVaziaQuandoSemServicos() {
            UUID barbershopId = UUID.randomUUID();
            when(repository.findByBarbershopId(barbershopId)).thenReturn(List.of());

            assertThat(service.findAll(barbershopId)).isEmpty();
        }
    }

    @Nested
    @DisplayName("update")
    class Update {

        @Test
        @DisplayName("deve atualizar todos os campos quando informados")
        void deveAtualizarTodosOsCamposInformados() {
            UUID barbershopId = UUID.randomUUID();
            UUID serviceId = UUID.randomUUID();
            ServiceOffering existente = buildOffering(serviceId, "Corte");
            ServiceOfferingUpdateDTO dto =
                    new ServiceOfferingUpdateDTO(
                            "Corte Premium",
                            "Cabelo Premium",
                            "nova desc",
                            new BigDecimal("50.00"));
            ServiceOfferingResponseDTO response =
                    new ServiceOfferingResponseDTO(
                            serviceId,
                            "Corte Premium",
                            "Cabelo Premium",
                            "nova desc",
                            new BigDecimal("50.00"),
                            true);

            when(repository.findByIdAndBarbershopId(serviceId, barbershopId))
                    .thenReturn(Optional.of(existente));
            when(repository.existsByNameAndBarbershopId("Corte Premium", barbershopId))
                    .thenReturn(false);
            when(mapper.toResponse(existente)).thenReturn(response);

            ServiceOfferingResponseDTO resultado = service.update(barbershopId, serviceId, dto);

            assertThat(resultado).isEqualTo(response);
            assertThat(existente.getName()).isEqualTo("Corte Premium");
            assertThat(existente.getCategory()).isEqualTo("Cabelo Premium");
            assertThat(existente.getDescription()).isEqualTo("nova desc");
            assertThat(existente.getPrice()).isEqualByComparingTo("50.00");
        }

        @Test
        @DisplayName("não deve checar duplicidade de nome quando o nome não mudar")
        void naoDeveChecarDuplicidadeQuandoNomeNaoMuda() {
            UUID barbershopId = UUID.randomUUID();
            UUID serviceId = UUID.randomUUID();
            ServiceOffering existente = buildOffering(serviceId, "Corte");
            ServiceOfferingUpdateDTO dto =
                    new ServiceOfferingUpdateDTO("Corte", "Cabelo", null, new BigDecimal("25.00"));
            when(repository.findByIdAndBarbershopId(serviceId, barbershopId))
                    .thenReturn(Optional.of(existente));
            when(mapper.toResponse(existente))
                    .thenReturn(
                            new ServiceOfferingResponseDTO(
                                    serviceId,
                                    "Corte",
                                    "Cabelo",
                                    null,
                                    new BigDecimal("25.00"),
                                    true));

            service.update(barbershopId, serviceId, dto);

            verify(repository, never()).existsByNameAndBarbershopId(any(), any());
        }

        @Test
        @DisplayName(
                "deve lançar ServiceOfferingAlreadyExistsException ao renomear para um nome já usado por outro serviço")
        void deveLancarExcecaoAoRenomearParaNomeJaUsado() {
            UUID barbershopId = UUID.randomUUID();
            UUID serviceId = UUID.randomUUID();
            ServiceOffering existente = buildOffering(serviceId, "Corte");
            ServiceOfferingUpdateDTO dto =
                    new ServiceOfferingUpdateDTO("Barba", "Cabelo", null, new BigDecimal("25.00"));
            when(repository.findByIdAndBarbershopId(serviceId, barbershopId))
                    .thenReturn(Optional.of(existente));
            when(repository.existsByNameAndBarbershopId("Barba", barbershopId)).thenReturn(true);

            assertThatThrownBy(() -> service.update(barbershopId, serviceId, dto))
                    .isInstanceOf(ServiceOfferingAlreadyExistsException.class);
        }

        @Test
        @DisplayName(
                "deve lançar ServiceOfferingNotFoundException ao atualizar serviço inexistente")
        void deveLancarExcecaoAoAtualizarServicoInexistente() {
            UUID barbershopId = UUID.randomUUID();
            UUID serviceId = UUID.randomUUID();
            when(repository.findByIdAndBarbershopId(serviceId, barbershopId))
                    .thenReturn(Optional.empty());
            ServiceOfferingUpdateDTO dto =
                    new ServiceOfferingUpdateDTO("Nome", "Cat", null, new BigDecimal("10.00"));

            assertThatThrownBy(() -> service.update(barbershopId, serviceId, dto))
                    .isInstanceOf(ServiceOfferingNotFoundException.class);
        }
    }

    @Nested
    @DisplayName("delete / activate / deactivate")
    class DeleteAndToggle {

        @Test
        @DisplayName("deve deletar o serviço quando ele pertencer à barbearia")
        void deveDeletarServico() {
            UUID barbershopId = UUID.randomUUID();
            UUID serviceId = UUID.randomUUID();
            ServiceOffering entity = buildOffering(serviceId, "Corte");
            when(repository.findByIdAndBarbershopId(serviceId, barbershopId))
                    .thenReturn(Optional.of(entity));

            service.delete(barbershopId, serviceId);

            verify(repository, times(1)).delete(entity);
        }

        @Test
        @DisplayName("deve desativar o serviço (active = false)")
        void deveDesativarServico() {
            UUID barbershopId = UUID.randomUUID();
            UUID serviceId = UUID.randomUUID();
            ServiceOffering entity = buildOffering(serviceId, "Corte");
            when(repository.findByIdAndBarbershopId(serviceId, barbershopId))
                    .thenReturn(Optional.of(entity));

            service.deactivate(barbershopId, serviceId);

            assertThat(entity.getActive()).isFalse();
        }

        @Test
        @DisplayName("deve reativar o serviço (active = true)")
        void deveReativarServico() {
            UUID barbershopId = UUID.randomUUID();
            UUID serviceId = UUID.randomUUID();
            ServiceOffering entity = buildOffering(serviceId, "Corte");
            entity.setActive(false);
            when(repository.findByIdAndBarbershopId(serviceId, barbershopId))
                    .thenReturn(Optional.of(entity));

            service.activate(barbershopId, serviceId);

            assertThat(entity.getActive()).isTrue();
        }

        @Test
        @DisplayName(
                "deve lançar ServiceOfferingNotFoundException ao desativar serviço inexistente")
        void deveLancarExcecaoAoDesativarServicoInexistente() {
            UUID barbershopId = UUID.randomUUID();
            UUID serviceId = UUID.randomUUID();
            when(repository.findByIdAndBarbershopId(serviceId, barbershopId))
                    .thenReturn(Optional.empty());

            assertThatThrownBy(() -> service.deactivate(barbershopId, serviceId))
                    .isInstanceOf(ServiceOfferingNotFoundException.class);
        }
    }
}
