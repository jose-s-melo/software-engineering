package com.dev.core.controllers;

import com.dev.core.dtos.AgendamentoRequestDTO;
import com.dev.core.dtos.AgendamentoResponseDTO;
import com.dev.core.dtos.agenda.AgendaRequestDTO;
import com.dev.core.models.Agendamento;
import com.dev.core.services.AgendamentoService;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Tag(name = "Agendamentos", description = "Endpoints para gerenciamento da agenda de horários do barbeiro")
@RestController
@RequestMapping("/api/agendamentos")
@RequiredArgsConstructor
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    @Operation(summary = "Criar ou atualizar horários disponíveis para um dia",
            description = "Disponibiliza uma lista de horários para uma data específica. O dia da semana é calculado automaticamente.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Agenda criada com sucesso"),
            @ApiResponse(responseCode = "400", description = "Dados da requisição inválidos")
    })
    @PostMapping
    public ResponseEntity<AgendamentoResponseDTO> criarAgenda(@RequestBody AgendamentoRequestDTO dto) {
        // O Service processa os dados usando os campos do DTO de entrada
        Agendamento agendamento = agendamentoService.criarAgenda(dto.data(), dto.horariosDisponiveis());

        // Transforma a entidade salva no DTO de resposta mapeado para o cliente
        return ResponseEntity.status(HttpStatus.CREATED).body(converterParaDTO(agendamento));
    }

    @Operation(summary = "Buscar os horários disponíveis por data",
            description = "Retorna a agenda e os horários que ainda não foram preenchidos em um dia específico.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Agenda localizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Nenhum horário cadastrado para a data informada")
    })
    @GetMapping("/disponibilidade")
    public ResponseEntity<AgendamentoResponseDTO> buscarPorData(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {

        Agendamento agenda = agendamentoService.buscarPorData(data);
        return ResponseEntity.ok(converterParaDTO(agenda));
    }

    /**
     * Método auxiliar privado para converter a Entidade JPA para o DTO de saída.
     * Dica: Em projetos grandes, você pode substituir isso por uma biblioteca como MapStruct ou ModelMapper.
     */
    private AgendamentoResponseDTO converterParaDTO(Agendamento agendamento) {
        return new AgendamentoResponseDTO(
                agendamento.getId(),
                agendamento.getData(),
                agendamento.getDiaSemana(),
                agendamento.getHorariosDisponiveis()
        );
    }
}
