package com.dev.core.dtos.barbershop;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

@Schema(description = "Dados necessários para o cadastro de uma barbearia")
public record BarbershopRegisterDTO(
        @Schema(description = "Nome da barbearia", example = "Barbearia Exemplo") String name,
        @Schema(description = "Nome de usuário único da barbearia", example = "barbearia-exemplo")
                String username,
        @Schema(description = "CPF do proprietário da barbearia.", example = "123.456.789-01")
                String cpf,
        @Schema(description = "CNPJ da barbearia.", example = "12.345.678/0001-95") String cnpj,
        @Schema(description = "Endereço da barbearia") AddressDTO location,
        @Schema(description = "Telefone da barbearia para contato", example = "(83) 9999-98888")
                String phone)
        implements Serializable {}
