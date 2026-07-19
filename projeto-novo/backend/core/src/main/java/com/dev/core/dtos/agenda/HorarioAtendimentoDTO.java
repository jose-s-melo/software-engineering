package com.dev.core.dtos.agenda;

import jakarta.validation.constraints.NotNull;
import java.time.DayOfWeek;
import java.time.LocalTime;

public record HorarioAtendimentoDTO(
        @NotNull(message = "O dia da semana é obrigatório")
        DayOfWeek diaDaSemana,

        @NotNull(message = "O horário de abertura é obrigatório")
        LocalTime horarioAbertura,

        @NotNull(message = "O horário de fechamento é obrigatório")
        LocalTime horarioFechamento
) {}