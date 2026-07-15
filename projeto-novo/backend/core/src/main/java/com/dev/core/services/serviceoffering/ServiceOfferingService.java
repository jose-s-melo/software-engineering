package com.dev.core.services.serviceoffering;

import com.dev.core.dtos.serviceoffering.ServiceOfferingCreateDTO;
import com.dev.core.dtos.serviceoffering.ServiceOfferingResponseDTO;
import com.dev.core.dtos.serviceoffering.ServiceOfferingUpdateDTO;
import com.dev.core.exceptions.BarbershopNotFoundException;
import com.dev.core.exceptions.InvalidServiceOfferingException;
import com.dev.core.exceptions.ServiceOfferingAlreadyExistsException;
import com.dev.core.exceptions.ServiceOfferingNotFoundException;
import com.dev.core.mappers.ServiceOfferingMapper;
import com.dev.core.models.barbershop.Barbershop;
import com.dev.core.models.serviceoffering.ServiceOffering;
import com.dev.core.repositories.BarbershopRepository;
import com.dev.core.repositories.ServiceOfferingRepository;
import jakarta.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOfferingService {

    @Autowired private ServiceOfferingRepository repository;

    @Autowired private BarbershopRepository barbershopRepository;

    @Autowired private ServiceOfferingMapper mapper;

    @Transactional
    public ServiceOfferingResponseDTO create(UUID barbershopId, ServiceOfferingCreateDTO dto) {
        validateCreateDTO(dto);

        Barbershop barbershop =
                barbershopRepository
                        .findById(barbershopId)
                        .orElseThrow(BarbershopNotFoundException::new);

        if (repository.existsByNameAndBarbershopId(dto.name(), barbershopId)) {
            throw new InvalidServiceOfferingException();
        }

        ServiceOffering serviceOffering = mapper.toEntity(dto);

        serviceOffering.setBarbershop(barbershop);

        repository.save(serviceOffering);

        return mapper.toResponse(serviceOffering);
    }

    public ServiceOfferingResponseDTO searchById(UUID barbershopId, UUID serviceId) {
        ServiceOffering serviceOffering =
                repository
                        .findByIdAndBarbershopId(serviceId, barbershopId)
                        .orElseThrow(ServiceOfferingNotFoundException::new);

        return mapper.toResponse(serviceOffering);
    }

    public List<ServiceOfferingResponseDTO> findAll(UUID barbershopId) {
        return repository.findByBarbershopId(barbershopId).stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Transactional
    public ServiceOfferingResponseDTO update(
            UUID barbershopId, UUID serviceId, ServiceOfferingUpdateDTO dto) {
        validateUpdateDTO(dto);

        ServiceOffering serviceOffering =
                repository
                        .findByIdAndBarbershopId(serviceId, barbershopId)
                        .orElseThrow(ServiceOfferingNotFoundException::new);

        if (!dto.name().equals(serviceOffering.getName())
                && repository.existsByNameAndBarbershopId(dto.name(), barbershopId)) {
            throw new ServiceOfferingAlreadyExistsException();
        }

        serviceOffering.setName(dto.name());

        if (dto.category() != null) {
            serviceOffering.setCategory(dto.category());
        }

        if (dto.description() != null) {
            serviceOffering.setDescription(dto.description());
        }

        if (dto.price() != null) {
            serviceOffering.setPrice(dto.price());
        }

        repository.save(serviceOffering);

        return mapper.toResponse(serviceOffering);
    }

    @Transactional
    public void delete(UUID barbershopId, UUID serviceId) {
        ServiceOffering serviceOffering =
                repository
                        .findByIdAndBarbershopId(serviceId, barbershopId)
                        .orElseThrow(ServiceOfferingNotFoundException::new);

        repository.delete(serviceOffering);
    }

    @Transactional
    public void deactivate(UUID barbershopId, UUID serviceId) {
        ServiceOffering serviceOffering =
                repository
                        .findByIdAndBarbershopId(serviceId, barbershopId)
                        .orElseThrow(ServiceOfferingNotFoundException::new);

        serviceOffering.setActive(false);
    }

    @Transactional
    public void activate(UUID barbershopId, UUID serviceId) {
        ServiceOffering serviceOffering =
                repository
                        .findByIdAndBarbershopId(serviceId, barbershopId)
                        .orElseThrow(ServiceOfferingNotFoundException::new);

        serviceOffering.setActive(true);
    }

    private void validateCreateDTO(ServiceOfferingCreateDTO dto) {
        validateParams(dto.name(), dto.category(), dto.price());
    }

    private void validateUpdateDTO(ServiceOfferingUpdateDTO dto) {
        validateParams(dto.name(), dto.category(), dto.price());
    }

    private void validateParams(String name, String category, BigDecimal price) {
        if (name == null || name.isBlank()) {
            throw new InvalidServiceOfferingException();
        }

        if (category == null || category.isBlank()) {
            throw new InvalidServiceOfferingException();
        }

        if (price == null || price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidServiceOfferingException();
        }
    }
}
