package com.dev.core.dtos;

import com.dev.core.models.user.UserRole;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;

@Schema(description = "Dados do usuário autenticado")
public record UserResponseDTO(
        @Schema(
                        description = "Identificador único do usuário",
                        example = "550e8400-e29b-41d4-a716-446655440000")
                UUID id,
        @Schema(description = "Endereço de e-mail do usuário", example = "admin@barbearia.com")
                String email,
        @Schema(
                        description = "Perfil de acesso do usuário",
                        example = "ADMIN",
                        allowableValues = {"COMMON", "CLIENTE", "BARBEIRO", "ADMIN"})
                UserRole role) {}
