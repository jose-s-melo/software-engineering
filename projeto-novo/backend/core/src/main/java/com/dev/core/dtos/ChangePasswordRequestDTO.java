package com.dev.core.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dados necessários para alteração da senha do usuário autenticado")
public record ChangePasswordRequestDTO(

        @Schema(
                description = "Senha atual do usuário",
                example = "MinhaSenha@123"
        )
        String oldPassword,

        @Schema(
                description = "Nova senha que será cadastrada",
                example = "NovaSenha@456"
        )
        String newPassword,

        @Schema(
                description = "Email registrado",
                example = "email@example.com"
        )
        String email

) {
}
