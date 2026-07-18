package com.dev.core.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import com.dev.core.models.StatusAtendimento;
import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Schema(description = "Dados de retorno do atendimento confirmado")
public record AtendimentoResponseDTO(
        UUID id,
        String emailClient,
        LocalDate data,
        String hora,
        String nomeServico,
        java.math.BigDecimal precoServico,
        StatusAtendimento status
) {}
