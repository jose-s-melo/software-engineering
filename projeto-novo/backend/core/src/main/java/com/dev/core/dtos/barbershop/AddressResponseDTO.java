package com.dev.core.dtos.barbershop;

import java.io.Serializable;
import java.util.UUID;

public record AddressResponseDTO(
    UUID id,
    String street,
    Long number,
    String neighborhood,
    String city,
    String uf
) implements Serializable {}
