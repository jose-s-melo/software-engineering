package com.dev.core.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

@Schema(description = "Resposta da autenticação contendo o token JWT e os dados do usuário autenticado")
public record TokenResponseDTO(

        @Schema(
                description = "Token JWT utilizado para autenticação nas demais requisições",
                example = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbkBiYXJiZWFyaWEuY29tIiwicm9sZSI6IkFETUlOIn0.abc123xyz"
        )
        String token,

        @Schema(
                description = "Mensagem indicando o resultado da operação",
                example = "Login realizado com sucesso."
        )
        String message,

        @Schema(
                description = "Dados do usuário autenticado"
        )
        UserResponseDTO dto

) implements Serializable {
}
