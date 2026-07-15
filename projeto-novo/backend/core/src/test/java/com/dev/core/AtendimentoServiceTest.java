package com.dev.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.dev.core.dtos.AtendimentoRequestDTO;
import com.dev.core.models.Agendamento;
import com.dev.core.models.Atendimento;
import com.dev.core.models.Servico;
import com.dev.core.models.StatusAtendimento;
import com.dev.core.repositories.AgendamentoRepository;
import com.dev.core.repositories.AtendimentoRepository;
import com.dev.core.repositories.ServicoRepository;
import com.dev.core.services.AtendimentoService;
import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
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
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Testes unitários para AtendimentoService.
 *
 * <p>Técnica: Caixa Cinza — conhecemos a ordem das validações internas (serviço -> agenda do dia ->
 * horário disponível) e testamos cada ponto de falha isoladamente, além do caminho feliz completo.
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("AtendimentoService")
class AtendimentoServiceTest {

    @Mock private AtendimentoRepository atendimentoRepository;

    @Mock private AgendamentoRepository agendamentoRepository;

    @Mock private ServicoRepository servicoRepository;

    @InjectMocks private AtendimentoService atendimentoService;

    private UserDetails buildUserDetails(String email) {
        return org.springframework.security.core.userdetails.User.withUsername(email)
                .password("HASH")
                .authorities("ROLE_CLIENTE")
                .build();
    }

    private Servico buildServico(UUID id) {
        return Servico.builder()
                .id(id)
                .nome("Corte")
                .preco(new BigDecimal("30.00"))
                .tempoEstimado("00:30")
                .build();
    }

    private Agendamento buildAgendamento(LocalDate data, List<String> horarios) {
        return Agendamento.builder()
                .data(data)
                .diaSemana(DayOfWeek.MONDAY)
                .horariosDisponiveis(new ArrayList<>(horarios))
                .build();
    }

    @Nested
    @DisplayName("agendarServico - caminho feliz")
    class CaminhoFeliz {

        @Test
        @DisplayName(
                "deve consumir o horário da agenda e salvar o atendimento com status CONFIRMADO")
        void deveConsumirHorarioESalvarAtendimentoConfirmado() {
            UUID servicoId = UUID.randomUUID();
            LocalDate data = LocalDate.of(2026, 7, 13);
            Servico servico = buildServico(servicoId);
            Agendamento agenda = buildAgendamento(data, List.of("09:00", "10:00"));
            AtendimentoRequestDTO dto = new AtendimentoRequestDTO(servicoId, data, "09:00");
            UserDetails user = buildUserDetails("cliente@email.com");

            when(servicoRepository.findById(servicoId)).thenReturn(Optional.of(servico));
            when(agendamentoRepository.findByData(data)).thenReturn(Optional.of(agenda));
            when(atendimentoRepository.save(any(Atendimento.class)))
                    .thenAnswer(inv -> inv.getArgument(0));

            Atendimento resultado = atendimentoService.agendarServico(dto, user);

            assertThat(resultado.getStatus()).isEqualTo(StatusAtendimento.CONFIRMADO);
            assertThat(resultado.getEmailClient()).isEqualTo("cliente@email.com");
            assertThat(resultado.getHora()).isEqualTo("09:00");
            assertThat(resultado.getServico()).isEqualTo(servico);
            assertThat(agenda.getHorariosDisponiveis()).containsExactly("10:00");
            verify(agendamentoRepository, times(1)).save(agenda);
        }
    }

    @Nested
    @DisplayName("agendarServico - validações")
    class Validacoes {

        @Test
        @DisplayName("deve lançar RuntimeException quando o serviço não existir")
        void deveLancarExcecaoQuandoServicoNaoExistir() {
            UUID servicoId = UUID.randomUUID();
            AtendimentoRequestDTO dto =
                    new AtendimentoRequestDTO(servicoId, LocalDate.of(2026, 7, 13), "09:00");
            when(servicoRepository.findById(servicoId)).thenReturn(Optional.empty());

            assertThatThrownBy(
                            () ->
                                    atendimentoService.agendarServico(
                                            dto, buildUserDetails("c@email.com")))
                    .isInstanceOf(RuntimeException.class)
                    .hasMessageContaining("Serviço não encontrado");

            verify(agendamentoRepository, never()).findByData(any());
        }

        @Test
        @DisplayName("deve lançar RuntimeException quando não houver agenda cadastrada para o dia")
        void deveLancarExcecaoQuandoNaoHouverAgendaParaODia() {
            UUID servicoId = UUID.randomUUID();
            LocalDate data = LocalDate.of(2026, 7, 13);
            when(servicoRepository.findById(servicoId))
                    .thenReturn(Optional.of(buildServico(servicoId)));
            when(agendamentoRepository.findByData(data)).thenReturn(Optional.empty());

            AtendimentoRequestDTO dto = new AtendimentoRequestDTO(servicoId, data, "09:00");

            assertThatThrownBy(
                            () ->
                                    atendimentoService.agendarServico(
                                            dto, buildUserDetails("c@email.com")))
                    .isInstanceOf(RuntimeException.class)
                    .hasMessageContaining("Não há horários cadastrados");
        }

        @Test
        @DisplayName(
                "deve lançar RuntimeException quando o horário escolhido já não estiver disponível")
        void deveLancarExcecaoQuandoHorarioIndisponivel() {
            UUID servicoId = UUID.randomUUID();
            LocalDate data = LocalDate.of(2026, 7, 13);
            when(servicoRepository.findById(servicoId))
                    .thenReturn(Optional.of(buildServico(servicoId)));
            when(agendamentoRepository.findByData(data))
                    .thenReturn(Optional.of(buildAgendamento(data, List.of("10:00"))));

            AtendimentoRequestDTO dto = new AtendimentoRequestDTO(servicoId, data, "09:00");

            assertThatThrownBy(
                            () ->
                                    atendimentoService.agendarServico(
                                            dto, buildUserDetails("c@email.com")))
                    .isInstanceOf(RuntimeException.class)
                    .hasMessageContaining("não está mais disponível");

            verify(atendimentoRepository, never()).save(any());
        }
    }
}
