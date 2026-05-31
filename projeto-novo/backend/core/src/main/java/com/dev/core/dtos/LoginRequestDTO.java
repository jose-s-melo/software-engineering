package com.dev.core.dtos;

import java.io.Serializable;

public record LoginRequestDTO(
        String email,
        String password
) implements Serializable {}
