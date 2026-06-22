package com.dev.core.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.core.dtos.LoginRequestDTO;
import com.dev.core.dtos.RegisterRequestDTO;
import com.dev.core.dtos.TokenResponseDTO;
import com.dev.core.services.AuthService;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "Autenticação", description = "Endpoints referentes a login e registro de usuários")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    @Operation(summary = "Realiza o login de um usuário", description = "Autentica um usuário e retorna um JWT.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Login realizado com sucesso", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TokenResponseDTO.class))),
            @ApiResponse(responseCode = "400", description = "Credenciais inválidas")
    })
    public ResponseEntity<TokenResponseDTO> login(@RequestBody @Valid LoginRequestDTO body) {
        try {
            String token = authService.login(body.email(), body.password());
            return ResponseEntity.ok(new TokenResponseDTO(token, "Success"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new TokenResponseDTO(null, "Failed"));
        }
    }

    @PostMapping("/register")
    @Operation(summary = "Registra um novo usuário cliente", description = "Cria uma nova conta. Os usuários registrados por esta rota recebem a role CLIENTE automaticamente.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Usuário criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Dados inválidos ou usuário já existente")
    })
    public ResponseEntity<Void> register(@RequestBody @Valid RegisterRequestDTO body) {
        try {
            authService.register(body);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}