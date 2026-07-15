package com.dev.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.dev.core.models.Agendamento;
import com.dev.core.repositories.AgendamentoRepository;
import com.dev.core.services.AgendamentoService;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Testes unitários para AgendamentoService.
 *
 * <p>Técnica: Partição de Equivalência (horário disponível vs. indisponível) + Análise de Valor
 * Limite (lista de horários com 1 único item, restando vazia após a reserva) + Caixa Branca (o dia
 * da semana é derivado internamente a partir da data, não recebido como parâmetro).
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("AgendamentoService")
class AgendamentoServiceTest {

    @Mock private AgendamentoRepository agendamentoRepository;

    @InjectMocks private AgendamentoService agendamentoService;

    @Nested
    @DisplayName("criarAgenda")
    class CriarAgenda {

        @Test
        @DisplayName("deve preencher automaticamente o dia da semana com base na data informada")
        void devePreencherDiaDaSemanaAutomaticamente() {
            LocalDate segunda = LocalDate.of(2026, 7, 13); // é uma segunda-feira
            when(agendamentoRepository.save(any(Agendamento.class)))
                    .thenAnswer(inv -> inv.getArgument(0));

            Agendamento resultado =
                    agendamentoService.criarAgenda(segunda, List.of("09:00", "10:00"));

            assertThat(resultado.getDiaSemana()).isEqualTo(DayOfWeek.MONDAY);
            assertThat(resultado.getData()).isEqualTo(segunda);
            assertThat(resultado.getHorariosDisponiveis()).containsExactly("09:00", "10:00");
        }

        @Test
        @DisplayName("deve persistir a agenda mesmo com lista de horários vazia")
        void devePersistirComListaVazia() {
            LocalDate data = LocalDate.of(2026, 7, 14);
            when(agendamentoRepository.save(any(Agendamento.class)))
                    .thenAnswer(inv -> inv.getArgument(0));

            Agendamento resultado = agendamentoService.criarAgenda(data, List.of());

            assertThat(resultado.getHorariosDisponiveis()).isEmpty();
            verify(agendamentoRepository, times(1)).save(any(Agendamento.class));
        }
    }

    @Nested
    @DisplayName("buscarPorData")
    class BuscarPorData {

        @Test
        @DisplayName("deve retornar a agenda quando existir para a data")
        void deveRetornarAgendaQuandoExistir() {
            LocalDate data = LocalDate.of(2026, 7, 13);
            Agendamento agendamento =
                    Agendamento.builder()
                            .data(data)
                            .diaSemana(DayOfWeek.MONDAY)
                            .horariosDisponiveis(new ArrayList<>(List.of("09:00")))
                            .build();
            when(agendamentoRepository.findByData(data)).thenReturn(Optional.of(agendamento));

            Agendamento resultado = agendamentoService.buscarPorData(data);

            assertThat(resultado).isEqualTo(agendamento);
        }

        @Test
        @DisplayName("deve lançar RuntimeException quando não houver agenda para a data")
        void deveLancarExcecaoQuandoNaoHouverAgenda() {
            LocalDate data = LocalDate.of(2026, 12, 25);
            when(agendamentoRepository.findByData(data)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> agendamentoService.buscarPorData(data))
                    .isInstanceOf(RuntimeException.class)
                    .hasMessageContaining("Nenhuma agenda disponível");
        }
    }

    @Nested
    @DisplayName("reservarHorario")
    class ReservarHorario {

        @Test
        @DisplayName("deve remover o horário reservado da lista de disponíveis e salvar")
        void deveRemoverHorarioDaListaESalvar() {
            LocalDate data = LocalDate.of(2026, 7, 13);
            Agendamento agendamento =
                    Agendamento.builder()
                            .data(data)
                            .diaSemana(DayOfWeek.MONDAY)
                            .horariosDisponiveis(new ArrayList<>(List.of("09:00", "10:00")))
                            .build();
            when(agendamentoRepository.findByData(data)).thenReturn(Optional.of(agendamento));

            agendamentoService.reservarHorario(data, "09:00");

            assertThat(agendamento.getHorariosDisponiveis()).containsExactly("10:00");
            ArgumentCaptor<Agendamento> captor = ArgumentCaptor.forClass(Agendamento.class);
            verify(agendamentoRepository).save(captor.capture());
            assertThat(captor.getValue().getHorariosDisponiveis()).doesNotContain("09:00");
        }

        @Test
        @DisplayName("valor limite: deve esvaziar a lista ao reservar o único horário restante")
        void deveEsvaziarListaAoReservarUnicoHorario() {
            LocalDate data = LocalDate.of(2026, 7, 13);
            Agendamento agendamento =
                    Agendamento.builder()
                            .data(data)
                            .diaSemana(DayOfWeek.MONDAY)
                            .horariosDisponiveis(new ArrayList<>(List.of("09:00")))
                            .build();
            when(agendamentoRepository.findByData(data)).thenReturn(Optional.of(agendamento));

            agendamentoService.reservarHorario(data, "09:00");

            assertThat(agendamento.getHorariosDisponiveis()).isEmpty();
        }

        @Test
        @DisplayName(
                "deve lançar RuntimeException ao tentar reservar um horário que não está na lista")
        void deveLancarExcecaoParaHorarioIndisponivel() {
            LocalDate data = LocalDate.of(2026, 7, 13);
            Agendamento agendamento =
                    Agendamento.builder()
                            .data(data)
                            .diaSemana(DayOfWeek.MONDAY)
                            .horariosDisponiveis(new ArrayList<>(List.of("09:00")))
                            .build();
            when(agendamentoRepository.findByData(data)).thenReturn(Optional.of(agendamento));

            assertThatThrownBy(() -> agendamentoService.reservarHorario(data, "15:00"))
                    .isInstanceOf(RuntimeException.class)
                    .hasMessageContaining("não está disponível");

            verify(agendamentoRepository, never()).save(any());
        }

        @Test
        @DisplayName(
                "deve lançar RuntimeException ao reservar horário para data sem agenda cadastrada")
        void deveLancarExcecaoParaDataSemAgenda() {
            LocalDate data = LocalDate.of(2026, 12, 25);
            when(agendamentoRepository.findByData(data)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> agendamentoService.reservarHorario(data, "09:00"))
                    .isInstanceOf(RuntimeException.class);
        }
    }
}
