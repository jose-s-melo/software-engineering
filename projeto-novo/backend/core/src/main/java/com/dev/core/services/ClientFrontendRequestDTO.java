package com.dev.core.services;

/**
 * ClientFrontendRequestDTO
 */
public record ClientFrontendRequestDTO(
    String email,
    String phone,
    String name
) {}
