package com.dev.core.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.dev.core.exceptions.InvalidBarbershopException;
import com.dev.core.services.barbershop.BarbershopService;

@RestController
@RequestMapping("/api/barbershop")
public class BarbershopController {

    @Autowired
    private BarbershopService service;

    @PostMapping
    public ResponseEntity<Void> registerBarbershop(@RequestBody BarbershopRegisterDTO body){
        ResponseEntity<Void> response;

        try {
            service.registerBarbershop(body);
            response = ResponseEntity.noContent().build();
        } catch (InvalidBarbershopException e) {
            response = ResponseEntity.badRequest().build();
        }

        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBarbershop(@PathVariable UUID id){
        service.deleteBarbershop(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateBarbershop(@PathVariable UUID id, @RequestBody BarbershopUpdateDTO body){
        service.updateBarbershop(id, body);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BarbershopResponseDTO> getBarbershop(@PathVariable UUID id){
        return ResponseEntity.ok(service.getBarbershop(id));
    }

    @GetMapping
    public ResponseEntity<List<BarbershopResponseDTO>> getAllbarbershops(){
        return ResponseEntity.ok(service.getAllBarbershops());
    }
}
