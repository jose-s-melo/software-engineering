package com.dev.core.repositories;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.core.models.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, UUID> {
    Optional<Agendamento> findFirstByData(LocalDate date);
    
    boolean existsByData(LocalDate date);
}
