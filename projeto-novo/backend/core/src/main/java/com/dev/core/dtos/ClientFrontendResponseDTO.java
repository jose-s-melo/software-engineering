package com.dev.core.dtos;

import java.io.Serializable;
import java.util.UUID;

import com.dev.core.models.user.UserRole;

public record ClientFrontendResponseDTO(
    UUID id,
    String name,
    String email,
    String phone,
    UserRole role
) implements Serializable {}
