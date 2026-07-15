package com.dev.core.mappers;

import com.dev.core.dtos.serviceoffering.ServiceOfferingCreateDTO;
import com.dev.core.dtos.serviceoffering.ServiceOfferingResponseDTO;
import com.dev.core.models.serviceoffering.ServiceOffering;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ServiceOfferingMapper {

    ServiceOffering toEntity(ServiceOfferingCreateDTO ServiceOfferingCreateDTO);

    ServiceOfferingResponseDTO toResponse(ServiceOffering ServiceOffering);

}