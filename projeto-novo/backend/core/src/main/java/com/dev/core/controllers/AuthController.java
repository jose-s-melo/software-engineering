package com.dev.core.controllers;

import com.dev.core.dtos.LoginRequestDTO;
import com.dev.core.dtos.TokenResponseDTO;
import com.dev.core.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<TokenResponseDTO> login(LoginRequestDTO body) {
        try {
            String token = authService.login(body.email(), body.password());
            return ResponseEntity.ok(new TokenResponseDTO(token, "Success"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new TokenResponseDTO(null, "Failed"));
        }
    }

    @PostMapping("/register")
    public ResponseEntity<Void> register(LoginRequestDTO body) {
        try {
            authService.register(body.email(), body.password());
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
