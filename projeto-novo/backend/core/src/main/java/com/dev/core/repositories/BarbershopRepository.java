package com.dev.core.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.core.dtos.barbershop.BarbershopResponseDTO;
import com.dev.core.models.barbershop.Barbershop;

public interface BarbershopRepository extends JpaRepository <Barbershop, UUID> {
    
    BarbershopResponseDTO findByName(String name);

    BarbershopResponseDTO findByUsername(String username);
    
    BarbershopResponseDTO findByCnpj(String cnpj);
}
