package com.dev.core.dtos.barbershop;

import java.io.Serializable;

public record BarbershopUpdateDTO(
    String name,
    String username,
    AddressDTO location,
    String phone
) implements Serializable {}
