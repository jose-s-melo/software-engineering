package com.dev.core.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.core.models.Agendamento;
import com.dev.core.repositories.AgendamentoRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
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
        Agendamento agendamento = null;

        if (agendamentoRepository.existsByData(data)) {
            agendamento = agendamentoRepository.findFirstByData(data).orElseThrow(() -> new RuntimeException("Data não encontrada"));

            for (String s : horarios) {
                agendamento.getHorariosDisponiveis().add(s);
            }
        } else {
            agendamento = Agendamento.builder()
                    .data(data)
                    .diaSemana(data.getDayOfWeek())
                    .horariosDisponiveis(horarios)
                    .build();
        }


        return agendamentoRepository.save(agendamento);
    }

    /**
     * Busca os horários disponíveis de um barbeiro em uma data específica.
     */
    @Transactional
    public Agendamento buscarPorData(LocalDate data) {

        System.out.println(agendamentoRepository.findFirstByData(data).get().getData());

        return agendamentoRepository.findFirstByData(data)
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
