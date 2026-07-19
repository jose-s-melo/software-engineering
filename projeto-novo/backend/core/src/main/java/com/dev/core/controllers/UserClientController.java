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

import com.dev.core.dtos.ClientFrontendResponseDTO;
import com.dev.core.dtos.RegisterRequestDTO;
import com.dev.core.dtos.UserResponseDTO;
import com.dev.core.services.ClientFrontendRequestDTO;
import com.dev.core.services.UserService;


@RestController
@RequestMapping("/api/users/clients")
public class UserClientController {

    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<List<ClientFrontendResponseDTO>> getClients() {
        return ResponseEntity.ok(userService.getAllClients());
    } 

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getClient(@PathVariable UUID id) {
        return ResponseEntity.ok(userService.getClient(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity updateClient(@RequestBody RegisterRequestDTO dto, @PathVariable UUID id) {
        userService.updateUser(id, dto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteClient(@PathVariable UUID id) {
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PostMapping
    public ResponseEntity addClient(@RequestBody ClientFrontendRequestDTO dto) {
        System.out.println(dto);
        userService.createClient(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    

}
