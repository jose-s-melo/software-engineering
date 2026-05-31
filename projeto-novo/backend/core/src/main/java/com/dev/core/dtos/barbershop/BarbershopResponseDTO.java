package com.dev.core.dtos.barbershop;

import java.io.Serializable;
import java.util.UUID;

public record BarbershopResponseDTO(
    UUID id,
    String name,
    String username,
    String cpf,
    String cnpj,
    AddressResponseDTO location,
    String phone
) implements Serializable {}
