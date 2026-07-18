package com.dev.core.controllers;

import com.dev.core.dtos.AtendimentoAdminRequestDTO;
import com.dev.core.dtos.AtendimentoRequestDTO;
import com.dev.core.dtos.AtendimentoResponseDTO;
import com.dev.core.models.Atendimento;
import com.dev.core.models.user.User;
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

import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "Atendimentos", description = "Endpoints para os clientes realizarem reservas de serviços")
@RestController
@RequestMapping("/api/atendimentos")
@RequiredArgsConstructor
public class AtendimentoController {

    private final AtendimentoService atendimentoService;

    @Operation(summary = "Realizar um agendamento escolhendo um serviço",
            description = "Reserva um horário específico na grade do barbeiro e vincula ao serviço solicitado pelo cliente.")
    @ApiResponse(responseCode = "201", description = "Atendimento agendado com sucesso")
    @PostMapping
    public ResponseEntity<AtendimentoResponseDTO> reservarHorario(@RequestBody AtendimentoRequestDTO dto, @AuthenticationPrincipal UserDetails user) {
        Atendimento atendimento = atendimentoService.agendarServico(dto, user);

        // Mapeia para o DTO de Saída
        AtendimentoResponseDTO response = converterParaDTO(atendimento);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Operation(summary = "Registrar atendimento manualmente (admin/barbeiro)",
            description = "Permite que o administrador ou barbeiro registre um atendimento diretamente para um cliente já cadastrado, sem depender de disponibilidade prévia na agenda.")
    @ApiResponse(responseCode = "201", description = "Atendimento registrado com sucesso")
    @PostMapping("/admin")
    public ResponseEntity<AtendimentoResponseDTO> registrarAtendimentoManual(@RequestBody AtendimentoAdminRequestDTO dto) {
        Atendimento atendimento = atendimentoService.registrarAtendimentoManual(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(converterParaDTO(atendimento));
    }

    @Operation(summary = "Listar todos os atendimentos",
            description = "Retorna todos os atendimentos registrados. Usado pelo painel administrativo.")
    @ApiResponse(responseCode = "200", description = "Lista retornada com sucesso")
    @GetMapping
    public ResponseEntity<List<AtendimentoResponseDTO>> listarTodos() {
        List<AtendimentoResponseDTO> response = atendimentoService.listarTodos().stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @Operation(summary = "Listar atendimentos de um cliente",
            description = "Retorna os atendimentos vinculados ao e-mail do cliente informado.")
    @ApiResponse(responseCode = "200", description = "Lista retornada com sucesso")
    @GetMapping("/cliente/{email}")
    public ResponseEntity<List<AtendimentoResponseDTO>> listarPorCliente(@PathVariable String email) {
        List<AtendimentoResponseDTO> response = atendimentoService.listarPorClienteEmail(email).stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    private AtendimentoResponseDTO converterParaDTO(Atendimento atendimento) {
        return new AtendimentoResponseDTO(
                atendimento.getId(),
                atendimento.getEmailClient(),
                atendimento.getData(),
                atendimento.getHora(),
                atendimento.getServico().getNome(),
                atendimento.getServico().getPreco(),
                atendimento.getStatus()
        );
    }
}
