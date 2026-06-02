package com.dev.core.services.barbershop;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.core.dtos.barbershop.BarbershopRegisterDTO;
import com.dev.core.dtos.barbershop.BarbershopResponseDTO;
import com.dev.core.dtos.barbershop.BarbershopUpdateDTO;
import com.dev.core.exceptions.BarbershopNotFoundException;
import com.dev.core.exceptions.InvalidBarbershopException;
import com.dev.core.mappers.AddressMapper;
import com.dev.core.mappers.BarbershopMapper;
import com.dev.core.models.barbershop.Address;
import com.dev.core.models.barbershop.Barbershop;
import com.dev.core.repositories.BarbershopRepository;

@Service
public class BarbershopService {

    @Autowired
    private BarbershopRepository repository;

    @Autowired
    private BarbershopMapper barbershopMapper;

    @Autowired
    private AddressMapper addressMapper;
    
    public BarbershopResponseDTO registerBarbershop(BarbershopRegisterDTO dto) {
        if (!validateBarbershopParams(dto)) {
            throw new InvalidBarbershopException();
        }

        Barbershop barbershop = barbershopMapper.toEntity(dto);

        Barbershop saved = repository.save(barbershop);

        return barbershopMapper.toResponse(saved);
    }

    public BarbershopResponseDTO deleteBarbershop(UUID id){
        Optional<Barbershop> optional = repository.findById(id);

        if (optional.isEmpty()) {
            throw new BarbershopNotFoundException();
        }

        repository.deleteById(id);
        
        return barbershopMapper.toResponse(optional.get());
    }

    public BarbershopResponseDTO updateBarbershop(UUID id, BarbershopUpdateDTO dto){
        Optional<Barbershop> optional = repository.findById(id);

        if (optional.isEmpty()) {
            throw new BarbershopNotFoundException();   
        }

        if (!validateBarbershopParams(dto)) {
            throw new InvalidBarbershopException();
        }
        
        optional.get().setName(dto.name());
        optional.get().setUsername(dto.username());

        Address location = optional.get().getLocation();
        Address newLocation = addressMapper.toEntity(dto.location());
        
        location.setStreet(newLocation.getStreet());
        location.setNumber(newLocation.getNumber());
        location.setNeighborhood(newLocation.getNeighborhood());
        location.setCity(newLocation.getCity());
        location.setUf(newLocation.getUf());

        optional.get().setLocation(location);

        repository.save(optional.get());

        return barbershopMapper.toResponse(optional.get());
    }

    public BarbershopResponseDTO getBarbershop(UUID id){
        Optional<Barbershop> optional = repository.findById(id);

        if (optional.isEmpty()) {
            throw new BarbershopNotFoundException();
        }

        return barbershopMapper.toResponse(optional.get());
    }

    public List<BarbershopResponseDTO> getAllBarbershops() {
        return repository.findAll()
                .stream()
                .map(barbershopMapper::toResponse)
                .toList();
    }

    private boolean validateBarbershopParams(BarbershopRegisterDTO dto){
        Boolean result = true;

        if (dto.name() == null || dto.name().isBlank()) {
            result = false;
        }
        if (dto.username() == null || dto.username().isBlank()) {
            result = false;
        }

        return result;
    }
    
    private boolean validateBarbershopParams(BarbershopUpdateDTO dto){
        Boolean result = true;

        if (dto.name() == null || dto.name().isBlank()) {
            result = false;
        }
        if (dto.username() == null || dto.username().isBlank()) {
            result = false;
        }

        return result;
    }
}
