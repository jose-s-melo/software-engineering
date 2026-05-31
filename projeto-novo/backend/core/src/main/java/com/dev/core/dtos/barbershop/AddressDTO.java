package com.dev.core.dtos.barbershop;

import java.io.Serializable;

public record AddressDTO(
    String street,
    Long number,
    String neighborhood,
    String city,
    String uf
) implements Serializable {}
