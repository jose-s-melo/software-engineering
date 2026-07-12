package com.dev.core.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Schema(description = "Dados para solicitar um novo atendimento/reserva")
public record AtendimentoRequestDTO(

        @Schema(description = "ID do serviço escolhido pelo cliente", example = "a1b2c3d4-e5f6-7a8b-9c0d-1e2f3a4b5c6d")
        @NotNull UUID servicoId,

        @Schema(description = "Data escolhida para o atendimento", example = "2026-07-13")
        @NotNull LocalDate data,

        @Schema(description = "Horário escolhido da lista de disponíveis", example = "10:00")
        @NotBlank String horarioEscolhido
) {}
