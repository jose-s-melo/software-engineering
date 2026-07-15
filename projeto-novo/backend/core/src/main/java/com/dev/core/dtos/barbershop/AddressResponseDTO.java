package com.dev.core.dtos.barbershop;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.UUID;

@Schema(description = "Resposta contendo os dados de um endereço cadastro")
public record AddressResponseDTO(
        @Schema(
                        description = "Identificador único do endereço",
                        example = "550e8400-e29b-41d4-a716-446655440000")
                UUID id,
        @Schema(description = "Nome da rua", example = "Rua João Pessoa") String street,
        @Schema(description = "Número do imóvel", example = "150") Long number,
        @Schema(description = "Bairro", example = "Centro") String neighborhood,
        @Schema(description = "Cidade", example = "Campina Grande") String city,
        @Schema(description = "Unidade Federativa (UF)", example = "PB") String uf)
        implements Serializable {}
