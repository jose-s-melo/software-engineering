package com.dev.core.dtos.barbershop;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.UUID;

@Schema(description = "Resposta contendo os dados de uma barbearia cadastrada")
public record BarbershopResponseDTO(
        @Schema(
                        description = "Identificador único da barbearia",
                        example = "550e8400-e29b-41d4-a716-446655440000")
                UUID id,
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
