package com.dev.core.controllers;

import com.dev.core.dtos.agenda.AgendaRequestDTO;
import com.dev.core.dtos.agenda.AgendaResponseDTO;
import com.dev.core.dtos.agenda.HorarioAtendimentoDTO;
import com.dev.core.models.agenda.Agenda;
import com.dev.core.services.agenda.AgendaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/agendas")
@Tag(name = "Agenda", description = "Endpoints para gerenciamento de horários de trabalho dos barbeiros")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @PutMapping
    @Operation(summary = "Cria ou atualiza a agenda de um barbeiro", 
               description = "Recebe os horários de trabalho semanais. Se o barbeiro já tiver uma agenda, ela será atualizada (Upsert).")
    public ResponseEntity<AgendaResponseDTO> createOrUpdateAgenda(@RequestBody @Valid AgendaRequestDTO body) {
        
        Agenda agendaSalva = agendaService.createOrUpdateAgenda(body);

        List<HorarioAtendimentoDTO> horariosDTO = agendaSalva.getHorariosDaSemana().stream()
                .map(h -> new HorarioAtendimentoDTO(h.getDiaDaSemana(), h.getHorarioAbertura(), h.getHorarioFechamento()))
                .collect(Collectors.toList());

        AgendaResponseDTO response = new AgendaResponseDTO(
                agendaSalva.getId(),
                agendaSalva.getBarbeiro().getId(),
                agendaSalva.getBarbeiro().getName(),
                horariosDTO
        );

        return ResponseEntity.ok(response);
    }
}