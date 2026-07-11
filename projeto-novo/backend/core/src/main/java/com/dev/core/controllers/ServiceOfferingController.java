package com.dev.core.controllers;

import com.dev.core.dtos.serviceoffering.ServiceOfferingCreateDTO;
import com.dev.core.dtos.serviceoffering.ServiceOfferingResponseDTO;
import com.dev.core.dtos.serviceoffering.ServiceOfferingUpdateDTO;
import com.dev.core.services.serviceoffering.ServiceOfferingService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/barbershops/{barbershopId}/services")
@Tag(
        name = "Serviços da Barbearia",
        description = "Endpoints responsáveis pelo gerenciamento de serviços oferecidos pelas barbearias"
)
public class ServiceOfferingController {

    private final ServiceOfferingService service;

    public ServiceOfferingController(ServiceOfferingService service) {
        this.service = service;
    }

    @PostMapping
    @Operation(
            summary = "Criar serviço",
            description = "Cria um novo serviço dentro de uma barbearia específica."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "Serviço criado com sucesso"
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Dados inválidos"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Barbearia não encontrada"
            ),
            @ApiResponse(
                    responseCode = "409",
                    description = "Serviço já existe nesta barbearia"
            )
    })
    public ResponseEntity<ServiceOfferingResponseDTO> create(
            @PathVariable UUID barbershopId,
            @RequestBody ServiceOfferingCreateDTO body) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.create(barbershopId, body));
    }

    @GetMapping
    @Operation(
            summary = "Listar serviços",
            description = "Retorna todos os serviços de uma barbearia."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Lista de serviços retornada com sucesso",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ServiceOfferingResponseDTO.class)
                    )
            )
    })
    public ResponseEntity<List<ServiceOfferingResponseDTO>> findAll(
            @PathVariable UUID barbershopId) {

        return ResponseEntity.ok(service.findAll(barbershopId));
    }

    @GetMapping("/{serviceId}")
    @Operation(
            summary = "Buscar serviço por ID",
            description = "Retorna um serviço específico de uma barbearia."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Serviço encontrado",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ServiceOfferingResponseDTO.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Serviço não encontrado"
            )
    })
    public ResponseEntity<ServiceOfferingResponseDTO> findById(
            @PathVariable UUID barbershopId,
            @PathVariable UUID serviceId) {

        return ResponseEntity.ok(service.searchById(barbershopId, serviceId));
    }

    @PutMapping("/{serviceId}")
    @Operation(
            summary = "Atualizar serviço",
            description = "Atualiza os dados de um serviço existente."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Serviço atualizado com sucesso"
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Dados inválidos"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Serviço não encontrado"
            ),
            @ApiResponse(
                    responseCode = "409",
                    description = "Conflito de nome de serviço"
            )
    })
    public ResponseEntity<ServiceOfferingResponseDTO> update(
            @PathVariable UUID barbershopId,
            @PathVariable UUID serviceId,
            @RequestBody ServiceOfferingUpdateDTO body) {

        return ResponseEntity.ok(
                service.update(barbershopId, serviceId, body)
        );
    }

    @PatchMapping("/{serviceId}/deactivate")
    @Operation(
            summary = "Desativar serviço",
            description = "Marca um serviço como inativo sem removê-lo do sistema."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "204",
                    description = "Serviço desativado com sucesso"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Serviço não encontrado"
            )
    })
    public ResponseEntity<Void> deactivate(
            @PathVariable UUID barbershopId,
            @PathVariable UUID serviceId) {

        service.deactivate(barbershopId, serviceId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{serviceId}/activate")
    @Operation(
            summary = "Ativar serviço",
            description = "Reativa um serviço previamente desativado."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "204",
                    description = "Serviço ativado com sucesso"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Serviço não encontrado"
            )
    })
    public ResponseEntity<Void> activate(
            @PathVariable UUID barbershopId,
            @PathVariable UUID serviceId) {

        service.activate(barbershopId, serviceId);
        return ResponseEntity.noContent().build();
    }
}