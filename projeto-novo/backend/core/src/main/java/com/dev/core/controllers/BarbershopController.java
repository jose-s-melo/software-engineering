package com.dev.core.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.core.dtos.barbershop.BarbershopRegisterDTO;
import com.dev.core.dtos.barbershop.BarbershopResponseDTO;
import com.dev.core.dtos.barbershop.BarbershopUpdateDTO;
import com.dev.core.services.barbershop.BarbershopService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/barbershop")
@Tag(
    name = "Barbearias",
    description = "Endpoints responsáveis pelo gerenciamento de barbearias"
)
public class BarbershopController {

    @Autowired
    private BarbershopService service;

    @PostMapping
    @Operation(
        summary = "Cadastrar uma barbearia",
        description = "Cria uma nova barbearia no sistema."
    )
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "201",
            description = "Barbearia criada com sucesso"
        ),
        @ApiResponse(
            responseCode = "400",
            description = "Dados inválidos"
        )
    })
    public ResponseEntity<BarbershopResponseDTO> registerBarbershop(
            @RequestBody BarbershopRegisterDTO body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.registerBarbershop(body));
    }

    @DeleteMapping("/{id}")
    @Operation(
        summary = "Remover uma barbearia",
        description = "Remove uma barbearia utilizando seu identificador."
    )
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "204",
            description = "Barbearia removida com sucesso"
        ),
        @ApiResponse(
            responseCode = "404",
            description = "Barbearia não encontrada"
        )
    })
    public ResponseEntity<Void> deleteBarbershop(
            @PathVariable UUID id) {
        service.deleteBarbershop(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    @Operation(
        summary = "Atualizar uma barbearia",
        description = "Atualiza os dados de uma barbearia existente."
    )
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200",
            description = "Barbearia atualizada com sucesso"
        ),
        @ApiResponse(
            responseCode = "400",
            description = "Dados inválidos"
        ),
        @ApiResponse(
            responseCode = "404",
            description = "Barbearia não encontrada"
        )
    })
    public ResponseEntity<Void> updateBarbershop(
            @PathVariable UUID id,
            @RequestBody BarbershopUpdateDTO body) {
        service.updateBarbershop(id, body);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    @Operation(
        summary = "Buscar uma barbearia",
        description = "Retorna os dados de uma barbearia pelo seu identificador."
    )
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200",
            description = "Barbearia encontrada",
            content = @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = BarbershopResponseDTO.class)
            )
        ),
        @ApiResponse(
            responseCode = "404",
            description = "Barbearia não encontrada"
        )
    })
    public ResponseEntity<BarbershopResponseDTO> getBarbershop(
            @PathVariable UUID id) {
        return ResponseEntity.ok(service.getBarbershop(id));
    }

    @GetMapping
    @Operation(
        summary = "Listar todas as barbearias",
        description = "Retorna todas as barbearias cadastradas no sistema."
    )
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200",
            description = "Lista de barbearias retornada com sucesso"
        )
    })
    public ResponseEntity<List<BarbershopResponseDTO>> getAllBarbershops() {
        return ResponseEntity.ok(service.getAllBarbershops());
    }
}