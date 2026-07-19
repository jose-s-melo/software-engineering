package com.dev.core.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Requisição de um serviço")
public record ServicoRequestFrontendDTO(
    @Schema(
                description = "Nome do serviço",
                example = "Corte Degradê"
        )
    String name,

    @Schema(
                description = "Descrição do serviço",
                example = "Corte de cabelo baixo"
    )
    String description,
    @Schema(
                description = "Preço do serviço",
                example = "30.00"
        )
    BigDecimal price,
    @Schema(
                description = "Tempo estimado para realização do serviço",
                example = "00:45"
        )
    String estimatedTime
) implements Serializable {}
