package com.dev.core.dtos;

import com.dev.core.models.StatusAtendimento;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;

@Schema(description = "Dados de retorno do atendimento confirmado")
public record AtendimentoResponseDTO(
        UUID id,
        String emailClient,
        String hora,
        String nomeServico,
        java.math.BigDecimal precoServico,
        StatusAtendimento status) {}
