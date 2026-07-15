package com.dev.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.dev.core.dtos.ServicoResponseDTO;
import com.dev.core.models.Servico;
import com.dev.core.repositories.ServicoRepository;
import com.dev.core.services.ServicoServiceImpl;
import jakarta.persistence.EntityNotFoundException;
import java.math.BigDecimal;
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

/**
 * Testes unitários para ServicoServiceImpl.
 *
 * <p>Técnica: Caixa Preta para as operações de CRUD (entradas válidas/limite de "não encontrado"),
 * Caixa Branca para create() (garante que o id é zerado antes de salvar, para impedir sobrescrita
 * acidental de um registro existente).
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("ServicoServiceImpl")
class ServicoServiceImplTest {

    @Mock private ServicoRepository servicoRepository;

    @InjectMocks private ServicoServiceImpl servicoService;

    private Servico buildServico(UUID id) {
        return Servico.builder()
                .id(id)
                .nome("Corte simples")
                .preco(new BigDecimal("30.00"))
                .tempoEstimado("00:30")
                .build();
    }

    @Nested
    @DisplayName("findAll / findAllDto")
    class FindAll {

        @Test
        @DisplayName("deve retornar todos os serviços cadastrados")
        void deveRetornarTodosOsServicos() {
            List<Servico> servicos =
                    List.of(buildServico(UUID.randomUUID()), buildServico(UUID.randomUUID()));
            when(servicoRepository.findAll()).thenReturn(servicos);

            List<Servico> resultado = servicoService.findAll();

            assertThat(resultado).hasSize(2);
        }

        @Test
        @DisplayName("deve retornar lista vazia quando não houver serviços")
        void deveRetornarListaVaziaQuandoNaoHouverServicos() {
            when(servicoRepository.findAll()).thenReturn(List.of());

            assertThat(servicoService.findAll()).isEmpty();
        }

        @Test
        @DisplayName("findAllDto deve converter entidades para DTOs preservando os campos")
        void deveConverterEntidadesParaDto() {
            Servico servico = buildServico(UUID.randomUUID());
            when(servicoRepository.findAll()).thenReturn(List.of(servico));

            List<ServicoResponseDTO> resultado = servicoService.findAllDto();

            assertThat(resultado).hasSize(1);
            ServicoResponseDTO dto = resultado.get(0);
            assertThat(dto.id()).isEqualTo(servico.getId());
            assertThat(dto.nome()).isEqualTo("Corte simples");
            assertThat(dto.preco()).isEqualByComparingTo("30.00");
            assertThat(dto.tempoEstimado()).isEqualTo("00:30");
        }
    }

    @Nested
    @DisplayName("findById")
    class FindById {

        @Test
        @DisplayName("deve retornar o serviço quando o id existir")
        void deveRetornarServicoQuandoIdExistir() {
            UUID id = UUID.randomUUID();
            Servico servico = buildServico(id);
            when(servicoRepository.findById(id)).thenReturn(Optional.of(servico));

            Servico resultado = servicoService.findById(id);

            assertThat(resultado).isEqualTo(servico);
        }

        @Test
        @DisplayName("deve lançar EntityNotFoundException quando o id não existir")
        void deveLancarExcecaoQuandoIdNaoExistir() {
            UUID id = UUID.randomUUID();
            when(servicoRepository.findById(id)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> servicoService.findById(id))
                    .isInstanceOf(EntityNotFoundException.class)
                    .hasMessageContaining(id.toString());
        }
    }

    @Nested
    @DisplayName("create")
    class Create {

        @Test
        @DisplayName("deve zerar o id recebido antes de salvar, para gerar um novo registro")
        void deveZerarIdAntesDeSalvar() {
            Servico servicoComIdSuspeito = buildServico(UUID.randomUUID());
            when(servicoRepository.save(any(Servico.class)))
                    .thenAnswer(invocation -> invocation.getArgument(0));

            servicoService.create(servicoComIdSuspeito);

            ArgumentCaptor<Servico> captor = ArgumentCaptor.forClass(Servico.class);
            verify(servicoRepository).save(captor.capture());
            assertThat(captor.getValue().getId()).isNull();
        }
    }

    @Nested
    @DisplayName("update")
    class Update {

        @Test
        @DisplayName("deve atualizar nome, preço e tempo estimado mantendo o id original")
        void deveAtualizarCamposMantendoId() {
            UUID id = UUID.randomUUID();
            Servico existente = buildServico(id);
            Servico novosDados =
                    Servico.builder()
                            .nome("Corte + Barba")
                            .preco(new BigDecimal("55.00"))
                            .tempoEstimado("01:00")
                            .build();
            when(servicoRepository.findById(id)).thenReturn(Optional.of(existente));
            when(servicoRepository.save(any(Servico.class)))
                    .thenAnswer(invocation -> invocation.getArgument(0));

            Servico resultado = servicoService.update(id, novosDados);

            assertThat(resultado.getId()).isEqualTo(id);
            assertThat(resultado.getNome()).isEqualTo("Corte + Barba");
            assertThat(resultado.getPreco()).isEqualByComparingTo("55.00");
            assertThat(resultado.getTempoEstimado()).isEqualTo("01:00");
        }

        @Test
        @DisplayName("deve lançar EntityNotFoundException ao atualizar um id inexistente")
        void deveLancarExcecaoAoAtualizarIdInexistente() {
            UUID id = UUID.randomUUID();
            when(servicoRepository.findById(id)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> servicoService.update(id, buildServico(id)))
                    .isInstanceOf(EntityNotFoundException.class);

            verify(servicoRepository, never()).save(any());
        }
    }

    @Nested
    @DisplayName("delete")
    class Delete {

        @Test
        @DisplayName("deve deletar o serviço quando o id existir")
        void deveDeletarServicoExistente() {
            UUID id = UUID.randomUUID();
            Servico servico = buildServico(id);
            when(servicoRepository.findById(id)).thenReturn(Optional.of(servico));

            servicoService.delete(id);

            verify(servicoRepository, times(1)).delete(servico);
        }

        @Test
        @DisplayName("deve lançar EntityNotFoundException ao deletar um id inexistente")
        void deveLancarExcecaoAoDeletarIdInexistente() {
            UUID id = UUID.randomUUID();
            when(servicoRepository.findById(id)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> servicoService.delete(id))
                    .isInstanceOf(EntityNotFoundException.class);

            verify(servicoRepository, never()).delete(any());
        }
    }
}
