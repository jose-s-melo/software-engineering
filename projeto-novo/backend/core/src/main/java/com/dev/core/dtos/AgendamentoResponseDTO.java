package com.dev.core.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Schema(description = "Representação detalhada da agenda de um dia")
public record AgendamentoResponseDTO(
        @Schema(
                        description = "ID único do agendamento criado no banco",
                        example = "f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
                UUID id,
        @Schema(description = "Data da agenda", example = "2026-07-13") LocalDate data,
        @Schema(description = "Dia da semana correspondente à data", example = "MONDAY")
                DayOfWeek diaSemana,
        @Schema(
                        description = "Lista de horários que ainda estão livres",
                        example = "[\"09:00\", \"09:30\", \"10:00\"]")
                List<String> horariosDisponiveis) {}
