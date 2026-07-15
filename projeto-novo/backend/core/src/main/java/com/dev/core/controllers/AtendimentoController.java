package com.dev.core.controllers;

import com.dev.core.dtos.AtendimentoRequestDTO;
import com.dev.core.dtos.AtendimentoResponseDTO;
import com.dev.core.models.Atendimento;
import com.dev.core.services.AtendimentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "Atendimentos",
        description = "Endpoints para os clientes realizarem reservas de serviços")
@RestController
@RequestMapping("/api/atendimentos")
@RequiredArgsConstructor
public class AtendimentoController {

    private final AtendimentoService atendimentoService;

    @Operation(
            summary = "Realizar um agendamento escolhendo um serviço",
            description =
                    "Reserva um horário específico na grade do barbeiro e vincula ao serviço solicitado pelo cliente.")
    @ApiResponse(responseCode = "201", description = "Atendimento agendado com sucesso")
    @PostMapping
    public ResponseEntity<AtendimentoResponseDTO> reservarHorario(
            @RequestBody AtendimentoRequestDTO dto, @AuthenticationPrincipal UserDetails user) {
        Atendimento atendimento = atendimentoService.agendarServico(dto, user);

        // Mapeia para o DTO de Saída
        AtendimentoResponseDTO response =
                new AtendimentoResponseDTO(
                        atendimento.getId(),
                        atendimento.getEmailClient(),
                        atendimento.getHora(),
                        atendimento.getServico().getNome(),
                        atendimento.getServico().getPreco(),
                        atendimento.getStatus());

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
