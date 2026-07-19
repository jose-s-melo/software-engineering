package com.dev.core.dtos.barbershop;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dados para atualização de uma barbearia")
public record BarbershopUpdateDTO(
    @Schema(
        description = "Novo nome da barbearia",
        example = "Barbearia Novo Exemplo"
    )
    String name,

    @Schema(
        description = "Novo nome de usuário da barbearia",
        example = "barbearia-novo-exemplo"
    )
    String username,

    @Schema(
        description = "Novo endereço da barbearia"
    )
    AddressDTO location,

    @Schema(
        description = "Novo telefone da barbearia para contato",
        example = "(21) 7777-76666"
    )
    String phone
) implements Serializable {}
