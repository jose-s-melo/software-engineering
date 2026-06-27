package com.dev.core.controllers;

import com.dev.core.dtos.client.ClientRequestDTO;
import com.dev.core.dtos.client.ClientResponseDTO;
import com.dev.core.models.Client;
import com.dev.core.models.user.User;
import com.dev.core.services.client.ClientService;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientResponseDTO> addClient(@RequestBody ClientRequestDTO body, @AuthenticationPrincipal User user) {
        UUID generatedId = UUID.randomUUID();
        Client client = clientService.addClient(user, body.getName(), body.getPhone());
        
        ClientResponseDTO responseBody = new ClientResponseDTO(client.getId(), client.getName(), client.getPhone());
        ResponseEntity<ClientResponseDTO> responseEntity = ResponseEntity.ok(responseBody);
        return responseEntity;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeClient(@PathVariable UUID id) {
        clientService.removeClient(id);
        ResponseEntity<Void> responseEntity = ResponseEntity.noContent().build();
        return responseEntity;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientResponseDTO> getClient(@PathVariable UUID id) {
        Client client = clientService.getClient(id);
        ResponseEntity<ClientResponseDTO> responseEntity;
        
        if (client != null) {
            ClientResponseDTO responseBody = new ClientResponseDTO(client.getId(), client.getName(), client.getPhone());
            responseEntity = ResponseEntity.ok(responseBody);
        } else {
            responseEntity = ResponseEntity.notFound().build();
        }
        return responseEntity;
    }

    @GetMapping
    public ResponseEntity<List<ClientResponseDTO>> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        List<ClientResponseDTO> dtoList = new ArrayList<>();
        
        for (Client client : clients) {
            dtoList.add(new ClientResponseDTO(client.getId(), client.getName(), client.getPhone()));
        }
        
        ResponseEntity<List<ClientResponseDTO>> responseEntity = ResponseEntity.ok(dtoList);
        return responseEntity;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientResponseDTO> updateClient(@PathVariable UUID id, @RequestBody ClientRequestDTO body) {
        Client client = clientService.updateClient(id, body.getName(), body.getPhone());
        ResponseEntity<ClientResponseDTO> responseEntity;
        
        if (client != null) {
            ClientResponseDTO responseBody = new ClientResponseDTO(client.getId(), client.getName(), client.getPhone());
            responseEntity = ResponseEntity.ok(responseBody);
        } else {
            responseEntity = ResponseEntity.notFound().build();
        }
        return responseEntity;
    }
}