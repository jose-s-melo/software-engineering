package com.dev.core.repositories;

import com.dev.core.dtos.barbershop.BarbershopResponseDTO;
import com.dev.core.models.barbershop.Barbershop;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarbershopRepository extends JpaRepository<Barbershop, UUID> {

    BarbershopResponseDTO findByName(String name);

    BarbershopResponseDTO findByUsername(String username);

    BarbershopResponseDTO findByCnpj(String cnpj);
}
