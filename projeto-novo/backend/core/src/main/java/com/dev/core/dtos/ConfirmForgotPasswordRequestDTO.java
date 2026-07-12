package com.dev.core.dtos;

public record ConfirmForgotPasswordRequestDTO(
    String email,
    String code,
    String newPassword
) {}
