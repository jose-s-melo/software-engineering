package com.dev.core.services.agenda;

import com.dev.core.dtos.agenda.AgendaRequestDTO;
import com.dev.core.dtos.agenda.HorarioAtendimentoDTO;
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

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public Agenda createOrUpdateAgenda(AgendaRequestDTO dto) {
        User barbeiro = userRepository.findById(dto.barbeiroId())
                .orElseThrow(UserNotFoundException::new);

        if (barbeiro.getRole() != UserRole.BARBEIRO) {
             throw new IllegalArgumentException("Apenas usuários com perfil BARBEIRO podem ter uma agenda.");
         }

        Agenda agenda = agendaRepository.findByBarbeiro(barbeiro)
                .orElse(new Agenda());

        agenda.setBarbeiro(barbeiro);

        List<HorarioAtendimento> novosHorarios = dto.horariosDaSemana().stream()
                .map(this::mapToEntity)
                .collect(Collectors.toList());

        agenda.setHorariosDaSemana(novosHorarios);

        return agendaRepository.save(agenda);
    }

    private HorarioAtendimento mapToEntity(HorarioAtendimentoDTO dto) {
        return HorarioAtendimento.builder()
                .diaDaSemana(dto.diaDaSemana())
                .horarioAbertura(dto.horarioAbertura())
                .horarioFechamento(dto.horarioFechamento())
                .build();
    }
}