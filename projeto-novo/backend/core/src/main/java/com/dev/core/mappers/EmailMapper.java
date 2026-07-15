package com.dev.core.mappers;

import com.dev.core.dtos.email.SendEmailDTO;
import com.dev.core.models.email.Email;
import org.mapstruct.*;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmailMapper {

    Email toEntity(SendEmailDTO sendEmailDTO);

    SendEmailDTO toDto(Email email);
}
