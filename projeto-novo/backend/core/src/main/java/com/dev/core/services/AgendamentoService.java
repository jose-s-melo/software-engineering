package com.dev.core.services;

import com.dev.core.models.Agendamento;
import com.dev.core.models.Atendimento;
import com.dev.core.models.StatusAtendimento;
import com.dev.core.repositories.AgendamentoRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
@Service
@RequiredArgsConstructor // Cria o construtor automaticamente via Lombok
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    /**
     * Cria ou atualiza a agenda de um barbeiro para um dia específico.
     * Preenche automaticamente o dia da semana com base na data informada.
     */
    @Transactional
    public Agendamento criarAgenda(LocalDate data, List<String> horarios) {
        Agendamento agendamento = Agendamento.builder()
                .data(data)
                .diaSemana(data.getDayOfWeek())
                .horariosDisponiveis(horarios)
                .build();

        return agendamentoRepository.save(agendamento);
    }

    /**
     * Busca os horários disponíveis de um barbeiro em uma data específica.
     */
    @Transactional
    public Agendamento buscarPorData(LocalDate data) {
        return agendamentoRepository.findByData(data)
                .orElseThrow(() -> new RuntimeException("Nenhuma agenda disponível para este barbeiro nesta data."));
    }

    /**
     * Remove um horário disponível quando um cliente faz um agendamento.
     */
    @Transactional
    public void reservarHorario(LocalDate data, String horarioParaReservar) {
        Agendamento agenda = buscarPorData(data);

        List<String> horarios = agenda.getHorariosDisponiveis();

        if (!horarios.contains(horarioParaReservar)) {
            throw new RuntimeException("Este horário não está disponível ou já foi reservado.");
        }

        horarios.remove(horarioParaReservar); // Remove o horário da lista
        agendamentoRepository.save(agenda);   // Salva a agenda atualizada
    }
}
