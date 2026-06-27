package com.dev.core.dtos.auth;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

@Schema(description = "Dados necessários para autenticação ou registro de um novo usuário")
public record LoginRequestDTO(
        @Schema(
                description = "Email do usuário",
                example = "example@example.com"
        )
        String email,

        @Schema(
                description = "Senha do usuário",
                example = "12345678"
        )
        String password
) implements Serializable {}
