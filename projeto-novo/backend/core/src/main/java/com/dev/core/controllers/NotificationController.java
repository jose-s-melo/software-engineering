package com.dev.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.dev.core.dtos.email.SendEmailDTO;
import com.dev.core.services.email.EmailService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/email")
@Tag(
        name = "Notificações por E-mail",
        description = "Endpoints responsáveis pelo envio de notificações por e-mail aos usuários."
)
public class NotificationController {

    @Autowired
    private EmailService service;

    @PostMapping("/send")
    @PreAuthorize("hasRole('ADMIN')")
    @Operation(
            summary = "Enviar notificação por e-mail",
            description = "Envia uma notificação por e-mail para um usuário utilizando o endereço de e-mail informado."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "E-mail enviado com sucesso"
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Dados inválidos para envio do e-mail"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Usuário não encontrado"
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Erro interno durante o envio do e-mail",
                    content = @Content
            )
    })
    public ResponseEntity<Void> sendEmail(
            @RequestBody SendEmailDTO body) {

        service.sendEmail(body);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}