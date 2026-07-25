package com.dev.core.services;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.core.dtos.AtendimentoAdminRequestDTO;
import com.dev.core.dtos.AtendimentoRequestDTO;
import com.dev.core.models.Agendamento;
import com.dev.core.models.Atendimento;
import com.dev.core.models.Servico;
import com.dev.core.models.StatusAtendimento;
import com.dev.core.models.user.User;
import com.dev.core.models.user.UserRole;
import com.dev.core.repositories.AgendamentoRepository;
import com.dev.core.repositories.AtendimentoRepository;
import com.dev.core.repositories.ServicoRepository;

import java.util.UUID;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AtendimentoService {

    private final AtendimentoRepository atendimentoRepository;
    private final AgendamentoRepository agendamentoRepository;
    private final ServicoRepository servicoRepository; // Repositório da sua entidade Servico

    @Transactional
    public Atendimento agendarServico(AtendimentoRequestDTO dto, UserDetails user) {
        // 1. Busca o serviço escolhido para garantir que ele existe
        Servico servico = servicoRepository.findById(dto.servicoId())
                .orElseThrow(() -> new RuntimeException("Serviço não encontrado."));

        // 2. Busca a grade de horários do barbeiro para aquele dia
        Agendamento agendaDoDia = agendamentoRepository.findFirstByData(dto.data())
                .orElseThrow(() -> new RuntimeException("Não há horários cadastrados para este dia."));

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
        Atendimento atendimento = Atendimento.builder()
                .servico(servico)
                .emailClient(user.getUsername())
                .data(dto.data())
                .hora(horaAtendimento)
                .status(StatusAtendimento.CONFIRMADO) // ou PENDENTE, dependendo do seu fluxo
                .build();

        return atendimentoRepository.save(atendimento);
    }

    /**
     * Lista todos os atendimentos cadastrados. Usado pelo painel administrativo (dashboard).
     */
    public List<Atendimento> listarTodos() {
        return atendimentoRepository.findAll();
    }

    /**
     * Lista os atendimentos de um cliente específico, pelo e-mail dele.
     */
    public List<Atendimento> listarPorClienteEmail(String email) {
        return atendimentoRepository.findByEmailClient(email);
    }

    /**
     * Permite que um administrador/barbeiro registre um atendimento manualmente
     * (ex.: cliente que chegou sem agendamento prévio pelo app), sem depender
     * de um horário previamente cadastrado na Agenda.
     */
    @Transactional
    public Atendimento registrarAtendimentoManual(AtendimentoAdminRequestDTO dto) {
        Servico servico = servicoRepository.findById(dto.servicoId())
                .orElseThrow(() -> new RuntimeException("Serviço não encontrado."));

        Atendimento atendimento = Atendimento.builder()
                .servico(servico)
                .emailClient(dto.emailClient())
                .data(dto.data())
                .hora(dto.hora())
                .status(dto.status() != null ? dto.status() : StatusAtendimento.CONFIRMADO)
                .build();

        return atendimentoRepository.save(atendimento);
    }

    /**
     * Cancela um atendimento. O próprio cliente pode cancelar os seus; admin/barbeiro podem cancelar qualquer um.
     * O horário liberado volta para a grade de disponibilidade do dia (espelha a remoção feita em agendarServico).
     */
    @Transactional
    public Atendimento cancelar(UUID id, User requester) {
        Atendimento atendimento = atendimentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Atendimento não encontrado."));

        boolean isStaff = requester.getRole() == UserRole.ADMIN || requester.getRole() == UserRole.BARBEIRO;
        if (!isStaff && !atendimento.getEmailClient().equalsIgnoreCase(requester.getEmail())) {
            throw new AccessDeniedException("Você não pode cancelar o agendamento de outro cliente.");
        }

        if (atendimento.getStatus() == StatusAtendimento.CANCELADO) {
            throw new RuntimeException("Atendimento já está cancelado.");
        }

        atendimento.setStatus(StatusAtendimento.CANCELADO);

        if (atendimento.getData() != null) {
            agendamentoRepository.findFirstByData(atendimento.getData()).ifPresent(agenda -> {
                if (!agenda.getHorariosDisponiveis().contains(atendimento.getHora())) {
                    agenda.getHorariosDisponiveis().add(atendimento.getHora());
                    agendamentoRepository.save(agenda);
                }
            });
        }

        return atendimentoRepository.save(atendimento);
    }

    private Instant LocalTimeToInstant(java.time.LocalDate data, String horario) {
        java.time.LocalTime tempo = java.time.LocalTime.parse(horario);
        ZonedDateTime zdt = java.time.LocalDateTime.of(data, tempo).atZone(ZoneId.of("America/Sao_Paulo"));
        return zdt.toInstant();
    }
}
