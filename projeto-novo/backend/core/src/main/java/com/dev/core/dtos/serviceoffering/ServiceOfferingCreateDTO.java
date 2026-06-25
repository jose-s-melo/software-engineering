package com.dev.core.dtos.serviceoffering;

import com.dev.core.models.serviceoffering.ServiceOffering;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link ServiceOffering}
 */
@Schema(description = "Dados necessários para criação de um serviço")
public record ServiceOfferingCreateDTO(

        @Schema(
                description = "Nome do serviço",
                example = "Corte masculino"
        )
        String name,

        @Schema(
                description = "Categoria do serviço",
                example = "Cabelo"
        )
        String category,

        @Schema(
                description = "Descrição opcional do serviço",
                example = "Corte tradicional com máquina e tesoura"
        )
        String description,

        @Schema(
                description = "Preço do serviço",
                example = "25.00"
        )
        BigDecimal price

) implements Serializable {}