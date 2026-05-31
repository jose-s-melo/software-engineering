package com.dev.core.dtos.barbershop;

public record AddressDTO(
    String street,
    Long number,
    String neighborhood,
    String city,
    String uf
) {}
