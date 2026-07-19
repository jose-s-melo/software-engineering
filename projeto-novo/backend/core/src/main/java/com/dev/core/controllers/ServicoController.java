package com.dev.core.controllers;

import com.dev.core.dtos.ServicoDTO;
import com.dev.core.dtos.ServicoRequestFrontendDTO;
import com.dev.core.dtos.ServicoResponseDTO;
import com.dev.core.models.Servico;
import com.dev.core.services.ServicoServiceImpl;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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
    @Operation(
            summary = "Lista todos os serviços",
            description = "Retorna todos os serviços cadastrados."
    )
    @ApiResponse(
            responseCode = "200",
            description = "Lista retornada com sucesso"
    )
    public List<ServicoResponseDTO> findAll() {
        return servicoService.findAllDto();
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "Busca um serviço pelo ID"
    )
    @ApiResponse(responseCode = "200", description = "Serviço encontrado")
    @ApiResponse(responseCode = "404", description = "Serviço não encontrado")
    public Servico findById(@PathVariable UUID id) {
        return servicoService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(
            summary = "Cadastrar serviço",
            description = "Cria um novo serviço."
    )
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            required = true,
            description = "Dados do serviço",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ServicoDTO.class),
                    examples = @ExampleObject(
                            name = "Exemplo",
                            value = """
                            {
                              "nome": "Corte Degradê",
                              "preco": 45.00,
                              "tempoEstimado": "01:10"
                            }
                            """
                    )
            )
    )
    @ApiResponse(
            responseCode = "201",
            description = "Serviço criado com sucesso"
    )
    public Servico create(@RequestBody ServicoRequestFrontendDTO dto) {
        return servicoService.create(dto);
    }

    @PutMapping("/{id}")
    @Operation(
            summary = "Atualizar serviço"
    )
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            required = true,
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ServicoDTO.class),
                    examples = @ExampleObject(
                            value = """
                            {
                              "nome": "Barba Premium",
                              "preco": 30.00,
                              "tempoEstimado": "00:45"
                            }
                            """
                    )
            )
    )
    @ApiResponse(responseCode = "200", description = "Serviço atualizado")
    @ApiResponse(responseCode = "404", description = "Serviço não encontrado")
    public Servico update(
            @PathVariable UUID id,
            @RequestBody ServicoRequestFrontendDTO dto
    ) {
        return servicoService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(
            summary = "Excluir serviço"
    )
    @ApiResponse(responseCode = "204", description = "Serviço removido")
    @ApiResponse(responseCode = "404", description = "Serviço não encontrado")
    public void delete(@PathVariable UUID id) {
        servicoService.delete(id);
    }
}
