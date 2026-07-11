package com.dev.core.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * {
 *   "id": "550e8400-e29b-41d4-a716-446655440000",
 *   "nome": "Corte de Cabelo",
 *   "preco": 35.00,
 *   "tempoEstimadoMinutos": 40
 * }
 */


@Schema(description = "Dados de um serviço")
public record ServicoDTO(

        @Schema(
                description = "Identificador único do serviço",
                example = "550e8400-e29b-41d4-a716-446655440000"
        )
        UUID id,

        @Schema(
                description = "Nome do serviço",
                example = "Corte de Cabelo"
        )
        String nome,

        @Schema(
                description = "Preço do serviço",
                example = "35.00"
        )
        BigDecimal preco,

        @Schema(
                description = "Tempo estimado para execução do serviço, em minutos",
                example = "40"
        )
        Integer tempoEstimadoMinutos
) {
}
