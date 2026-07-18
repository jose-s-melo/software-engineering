package com.dev.core.dtos;

import com.dev.core.models.StatusAtendimento;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@Schema(description = "Dados para o administrador/barbeiro registrar um atendimento manualmente")
public record AtendimentoAdminRequestDTO(

        @Schema(description = "E-mail do cliente já cadastrado", example = "cliente@email.com")
        @NotBlank String emailClient,

        @Schema(description = "ID do serviço escolhido")
        @NotNull UUID servicoId,

        @Schema(description = "Data do atendimento", example = "2026-07-16")
        @NotNull LocalDate data,

        @Schema(description = "Horário do atendimento", example = "14:30")
        @NotBlank String hora,

        @Schema(description = "Status do atendimento", example = "CONFIRMADO")
        StatusAtendimento status
) {}
