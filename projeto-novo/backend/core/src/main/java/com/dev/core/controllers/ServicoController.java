package com.dev.core.controllers;

import com.dev.core.dtos.ServicoDTO;
import com.dev.core.models.Servico;
import com.dev.core.services.ServicoServiceImpl;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/servicos")
@RequiredArgsConstructor
@Tag(name = "Serviços", description = "Gerenciamento dos serviços oferecidos")
public class ServicoController {

    private final ServicoServiceImpl servicoService;

    @GetMapping
    @Operation(summary = "Lista todos os serviços")
    public List<ServicoDTO> findAll() {
        return servicoService.findAllDto();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca um serviço pelo ID")
    public Servico findById(@PathVariable UUID id) {
        return servicoService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cadastra um novo serviço")
    public Servico create(@RequestBody Servico dto) {
        return servicoService.create(dto);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza um serviço")
    public Servico update(
            @PathVariable UUID id,
            @RequestBody Servico dto
    ) {
        return servicoService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Remove um serviço")
    public void delete(@PathVariable UUID id) {
        servicoService.delete(id);
    }
}
