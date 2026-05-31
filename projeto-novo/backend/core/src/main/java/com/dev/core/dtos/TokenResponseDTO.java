package com.dev.core.dtos;

import java.io.Serializable;

public record TokenResponseDTO(
        String token,
        String message
) implements Serializable {}
