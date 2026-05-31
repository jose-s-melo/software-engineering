package com.dev.core.dtos.barbershop;

public record BarbershopRegisterDTO(
    String name,
    String username,
    String cpf,
    String cnpj,
    AddressDTO location,
    String phone
) {}
