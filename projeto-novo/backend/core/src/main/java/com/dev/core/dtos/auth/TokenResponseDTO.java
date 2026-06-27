package com.dev.core.dtos.auth;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

@Schema(description = "Resposta contendo um JWT e uma mensagem")
public record TokenResponseDTO(
        @Schema(
                description = "Token JWT gerado após a autenticação",
                example = "eyJhbGciOiJIUzI1NiJ9..."
        )
        String token,

        @Schema(
                description = "Mensagem indicando o resultado da operação",
                example = "Success"
        )
        String message,

        UserResponseDTO user
) implements Serializable {}
