package com.dev.core.dtos.agenda;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

public record AgendaRequestDTO(
        @NotNull(message = "O ID do barbeiro é obrigatório")
        UUID barbeiroId,

        @NotEmpty(message = "A agenda deve ter pelo menos um dia de atendimento")
        @Valid
        List<HorarioAtendimentoDTO> horariosDaSemana
) {}