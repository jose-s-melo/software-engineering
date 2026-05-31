package com.dev.core.mapper;

import org.mapstruct.Mapper;

import com.dev.core.dtos.barbershop.BarbershopRegisterDTO;
import com.dev.core.dtos.barbershop.BarbershopResponseDTO;
import com.dev.core.models.barbershop.Barbershop;

@Mapper(componentModel = "spring", uses = AddressMapper.class)
public interface BarbershopMapper {
    
    Barbershop toEntity(BarbershopRegisterDTO dto);
    
    BarbershopResponseDTO toResponse(Barbershop entity);
}