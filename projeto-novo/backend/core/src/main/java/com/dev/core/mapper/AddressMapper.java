package com.dev.core.mapper;

import org.mapstruct.Mapper;

import com.dev.core.dtos.barbershop.AddressDTO;
import com.dev.core.dtos.barbershop.AddressResponseDTO;
import com.dev.core.models.barbershop.Address;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    
    Address toEntity(AddressDTO dto);
    
    AddressResponseDTO toResponse(Address address);
}
