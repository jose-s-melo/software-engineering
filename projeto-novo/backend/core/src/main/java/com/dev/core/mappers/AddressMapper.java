package com.dev.core.mappers;

import com.dev.core.dtos.barbershop.AddressDTO;
import com.dev.core.dtos.barbershop.AddressResponseDTO;
import com.dev.core.models.barbershop.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address toEntity(AddressDTO dto);

    AddressResponseDTO toResponse(Address address);
}
