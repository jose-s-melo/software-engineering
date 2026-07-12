package com.dev.core.models;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.dev.core.models.serviceoffering.ServiceOffering;

import com.dev.core.models.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String emailClient;

    @Column(nullable = false)
    private String hora;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "servico_id")
    private Servico servico;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusAtendimento status;
}
