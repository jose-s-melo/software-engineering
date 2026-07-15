package com.dev.core.dtos.agenda;

import java.util.List;
import java.util.UUID;

public record AgendaResponseDTO(
        UUID id,
        UUID barbeiroId,
        String nomeBarbeiro,
        List<HorarioAtendimentoDTO> horariosDaSemana) {}
