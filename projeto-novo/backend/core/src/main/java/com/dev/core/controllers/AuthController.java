package com.dev.core.controllers;

import com.dev.core.dtos.UserResponseDTO;
import com.dev.core.repositories.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

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

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    @Operation(
            summary = "Realiza o login",
            description = "Autentica um usuário utilizando e-mail e senha e retorna um token JWT juntamente com os dados do usuário."
    )
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            required = true,
            description = "Credenciais do usuário",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = LoginRequestDTO.class),
                    examples = @ExampleObject(
                            name = "Login",
                            value = """
                        {
                          "email": "admin@barbearia.com",
                          "password": "123456"
                        }
                        """
                    )
            )
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Login realizado com sucesso",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = TokenResponseDTO.class),
                            examples = @ExampleObject(
                                    value = """
                                {
                                  "token": "eyJhbGciOiJIUzI1NiJ9...",
                                  "message": "Login realizado com sucesso.",
                                  "dto": {
                                    "id": "550e8400-e29b-41d4-a716-446655440000",
                                    "email": "admin@barbearia.com",
                                    "role": "ADMIN"
                                  }
                                }
                                """
                            )
                    )
            ),
            @ApiResponse(responseCode = "400", description = "E-mail ou senha inválidos")
    })
    public ResponseEntity<TokenResponseDTO> login(@RequestBody LoginRequestDTO body) {
        try {
            return ResponseEntity.ok(authService.login(body));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new TokenResponseDTO(null, "Failed", null));
        }
    }

    @PostMapping("/register")
    @Operation(
            summary = "Cadastrar usuário",
            description = "Cria uma nova conta. Os usuários são cadastrados com o perfil COMMON por padrão."
    )
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            required = true,
            description = "Dados para cadastro",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = RegisterRequestDTO.class),
                    examples = @ExampleObject(
                            value = """
                        {
                          "email": "usuario@barbearia.com",
                          "password": "123456"
                        }
                        """
                    )
            )
    )
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Usuário cadastrado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Usuário já cadastrado ou dados inválidos")
    })
    public ResponseEntity<Void> register(@RequestBody RegisterRequestDTO body) {
        try {
            authService.register(body);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}