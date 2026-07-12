package com.dev.core.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.util.List;

@Schema(description = "Dados para criação ou atualização de horários disponíveis na agenda")
public record AgendamentoRequestDTO(

        @Schema(description = "Data da agenda aberta", example = "2026-07-13")
        LocalDate data,

        @Schema(description = "Lista de horários em formato HH:mm que estarão disponíveis neste dia",
                example = "[\"09:00\", \"09:30\", \"10:00\", \"14:00\", \"15:30\"]")
        List<String> horariosDisponiveis
) {}
