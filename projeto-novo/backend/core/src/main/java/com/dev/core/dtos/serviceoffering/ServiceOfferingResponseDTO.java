package com.dev.core.dtos.serviceoffering;

import com.dev.core.models.serviceoffering.ServiceOffering;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

/** DTO for {@link ServiceOffering} */
@Schema(description = "Dados de retorno de um serviço da barbearia")
public record ServiceOfferingResponseDTO(
        @Schema(description = "Identificador do serviço") UUID id,
        @Schema(description = "Nome do serviço", example = "Corte masculino") String name,
        @Schema(description = "Categoria do serviço", example = "Cabelo") String category,
        @Schema(
                        description = "Descrição opcional do serviço",
                        example = "Corte tradicional com máquina e tesoura")
                String description,
        @Schema(description = "Preço do serviço", example = "25.00") BigDecimal price,
        @Schema(description = "Indica se o serviço está ativo", example = "true") Boolean active)
        implements Serializable {}
