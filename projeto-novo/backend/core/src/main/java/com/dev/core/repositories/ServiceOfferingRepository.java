package com.dev.core.repositories;

import com.dev.core.models.serviceoffering.ServiceOffering;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceOfferingRepository extends JpaRepository<ServiceOffering, UUID> {

    Optional<ServiceOffering> findByIdAndBarbershopId(UUID id, UUID barbershopId);

    List<ServiceOffering> findByBarbershopId(UUID barbershopId);

    boolean existsByNameAndBarbershopId(String name, UUID barbershopId);
}
