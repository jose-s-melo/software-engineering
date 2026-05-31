package com.dev.core.dtos.barbershop;

import java.io.Serializable;

public record BarbershopRegisterDTO(
    String name,
    String username,
    String cpf,
    String cnpj,
    AddressDTO location,
    String phone
) implements Serializable {}
