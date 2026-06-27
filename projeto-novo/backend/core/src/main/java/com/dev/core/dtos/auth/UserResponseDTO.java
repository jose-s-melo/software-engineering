package com.dev.core.dtos.auth;

import com.dev.core.models.user.UserRole;

import java.io.Serializable;
import java.util.UUID;

public record UserResponseDTO(
        UUID id,
        String email,
        UserRole role
) implements Serializable {}
