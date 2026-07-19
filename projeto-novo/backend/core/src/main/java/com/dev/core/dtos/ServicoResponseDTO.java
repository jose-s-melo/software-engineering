package com.dev.core.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.UUID;

@Schema(description = "Dados de um serviço")
public record ServicoResponseDTO(

        @Schema(
                description = "Identificador único do serviço",
                example = "550e8400-e29b-41d4-a716-446655440000"
        )
        UUID id,

        @Schema(
                description = "Nome do serviço",
                example = "Corte Degradê"
        )
        String name,

        @Schema(
                description = "Preço do serviço",
                example = "45.00"
        )
        BigDecimal price,

        @Schema(
                description = "Tempo estimado de execução",
                example = "01:40"
        )
        String estimatedTime,

        @Schema(description = "Descrição do serviço", example = "Corte de cabelo baixo")
        String description
) {
}
