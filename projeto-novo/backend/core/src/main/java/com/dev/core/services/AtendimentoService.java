package com.dev.core.services;

import com.dev.core.dtos.AtendimentoRequestDTO;
import com.dev.core.models.Agendamento;
import com.dev.core.models.Atendimento;
import com.dev.core.models.Servico;
import com.dev.core.models.StatusAtendimento;
import com.dev.core.repositories.AgendamentoRepository;
import com.dev.core.repositories.AtendimentoRepository;
import com.dev.core.repositories.ServicoRepository;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AtendimentoService {

    private final AtendimentoRepository atendimentoRepository;
    private final AgendamentoRepository agendamentoRepository;
    private final ServicoRepository servicoRepository; // Repositório da sua entidade Servico

    @Transactional
    public Atendimento agendarServico(AtendimentoRequestDTO dto, UserDetails user) {
        // 1. Busca o serviço escolhido para garantir que ele existe
        Servico servico =
                servicoRepository
                        .findById(dto.servicoId())
                        .orElseThrow(() -> new RuntimeException("Serviço não encontrado."));

        // 2. Busca a grade de horários do barbeiro para aquele dia
        Agendamento agendaDoDia =
                agendamentoRepository
                        .findByData(dto.data())
                        .orElseThrow(
                                () ->
                                        new RuntimeException(
                                                "Não há horários cadastrados para este dia."));

        // 3. Valida e remove o horário da lista de disponíveis
        if (!agendaDoDia.getHorariosDisponiveis().contains(dto.horarioEscolhido())) {
            throw new RuntimeException("O horário escolhido não está mais disponível.");
        }
        agendaDoDia.getHorariosDisponiveis().remove(dto.horarioEscolhido());
        agendamentoRepository.save(agendaDoDia); // Atualiza a grade (consome o horário)

        // 4. Converte a Data (LocalDate) + Horário ("10:00") para um Instant UTC
        // Ajuste o ZoneId para a região da sua barbearia (ex: "America/Sao_Paulo")
        String horaAtendimento = dto.horarioEscolhido();

        // 5. Cria e salva o Atendimento
        Atendimento atendimento =
                Atendimento.builder()
                        .servico(servico)
                        .emailClient(user.getUsername())
                        .hora(horaAtendimento)
                        .status(
                                StatusAtendimento
                                        .CONFIRMADO) // ou PENDENTE, dependendo do seu fluxo
                        .build();

        return atendimentoRepository.save(atendimento);
    }

    private Instant LocalTimeToInstant(java.time.LocalDate data, String horario) {
        java.time.LocalTime tempo = java.time.LocalTime.parse(horario);
        ZonedDateTime zdt =
                java.time.LocalDateTime.of(data, tempo).atZone(ZoneId.of("America/Sao_Paulo"));
        return zdt.toInstant();
    }
}
