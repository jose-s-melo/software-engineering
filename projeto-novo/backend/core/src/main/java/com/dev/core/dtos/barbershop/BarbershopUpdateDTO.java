package com.dev.core.dtos.barbershop;

public record BarbershopUpdateDTO(
    String name,
    String username,
    AddressDTO location,
    String phone
) {}
