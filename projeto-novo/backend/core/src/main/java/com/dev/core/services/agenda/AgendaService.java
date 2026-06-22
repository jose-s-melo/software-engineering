package com.dev.core.services.agenda;

import com.dev.core.dtos.agenda.AgendaRequestDTO;
import com.dev.core.dtos.agenda.HorarioAtendimentoDTO;
import com.dev.core.exceptions.InvalidAgendaException;
import com.dev.core.exceptions.UserNotFoundException;
import com.dev.core.models.agenda.Agenda;
import com.dev.core.models.agenda.HorarioAtendimento;
import com.dev.core.models.user.User;
import com.dev.core.models.user.UserRole;
import com.dev.core.repositories.AgendaRepository;
import com.dev.core.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public Agenda createOrUpdateAgenda(AgendaRequestDTO dto) {
        if (dto.barbeiroId() == null) {
            throw new InvalidAgendaException("O ID do barbeiro não pode ser nulo.");
        }

        User barbeiro = userRepository.findById(dto.barbeiroId())
                .orElseThrow(UserNotFoundException::new);

        if (barbeiro.getRole() != UserRole.BARBEIRO) {
            throw new InvalidAgendaException("Apenas usuários com perfil BARBEIRO podem ter uma agenda.");
        }

        if (dto.horariosDaSemana() != null && !dto.horariosDaSemana().isEmpty()) {
            validarHorarios(dto.horariosDaSemana());
        }

        Agenda agenda = agendaRepository.findByBarbeiro(barbeiro)
                .orElse(new Agenda());

        agenda.setBarbeiro(barbeiro);

        List<HorarioAtendimento> novosHorarios = dto.horariosDaSemana() != null 
                ? dto.horariosDaSemana().stream().map(this::mapToEntity).collect(Collectors.toList())
                : List.of();

        agenda.setHorariosDaSemana(novosHorarios);

        return agendaRepository.save(agenda);
    }

    private void validarHorarios(List<HorarioAtendimentoDTO> horarios) {
        Map<DayOfWeek, List<HorarioAtendimentoDTO>> horariosPorDia = horarios.stream()
                .collect(Collectors.groupingBy(HorarioAtendimentoDTO::diaDaSemana));

        for (Map.Entry<DayOfWeek, List<HorarioAtendimentoDTO>> entry : horariosPorDia.entrySet()) {
            List<HorarioAtendimentoDTO> horariosDoDia = new ArrayList<>(entry.getValue());
            
            horariosDoDia.sort(Comparator.comparing(HorarioAtendimentoDTO::horarioAbertura));

            for (int i = 0; i < horariosDoDia.size(); i++) {
                HorarioAtendimentoDTO atual = horariosDoDia.get(i);

                if (!atual.horarioAbertura().isBefore(atual.horarioFechamento())) {
                    throw new InvalidAgendaException(String.format(
                            "No dia %s, o horário de abertura (%s) deve ser anterior ao fechamento (%s).",
                            atual.diaDaSemana(), atual.horarioAbertura(), atual.horarioFechamento()
                    ));
                }

                if (i < horariosDoDia.size() - 1) {
                    HorarioAtendimentoDTO proximo = horariosDoDia.get(i + 1);
                    
                    if (atual.horarioFechamento().isAfter(proximo.horarioAbertura())) {
                        throw new InvalidAgendaException(String.format(
                                "Existem horários sobrepostos no dia %s: um bloco termina às %s e o seguinte tenta iniciar às %s.",
                                atual.diaDaSemana(), atual.horarioFechamento(), proximo.horarioAbertura()
                        ));
                    }
                }
            }
        }
    }

    private HorarioAtendimento mapToEntity(HorarioAtendimentoDTO dto) {
        return HorarioAtendimento.builder()
                .diaDaSemana(dto.diaDaSemana())
                .horarioAbertura(dto.horarioAbertura())
                .horarioFechamento(dto.horarioFechamento())
                .build();
    }
}