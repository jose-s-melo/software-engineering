package com.dev.core.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.UUID;


@Schema(description = "Dados de um serviço")
public record ServicoDTO(

        @Schema(
                description = "Nome do serviço",
                example = "Corte Degradê"
        )
        String nome,

        @Schema(
                description = "Preço do serviço",
                example = "45.00"
        )
        BigDecimal preco,

        @Schema(
                description = "Tempo estimado de execução",
                example = "01:40"
        )
        String tempoEstimado
) {
}
