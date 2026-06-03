package com.dev.core.dtos.barbershop;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dados de endereço de uma barbearia")
public record AddressDTO(

    @Schema(
        description = "Nome da rua",
        example = "Rua João Pessoa"
    )
    String street,

    @Schema(
        description = "Número do imóvel",
        example = "150"
    )
    Long number,

    @Schema(
        description = "Bairro",
        example = "Centro"
    )
    String neighborhood,

    @Schema(
        description = "Cidade",
        example = "Campina Grande"
    )
    String city,

    @Schema(
        description = "Unidade Federativa (UF)",
        example = "PB"
    )
    String uf

) implements Serializable {}