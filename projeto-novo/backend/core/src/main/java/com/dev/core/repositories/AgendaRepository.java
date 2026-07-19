package com.dev.core.repositories;

import com.dev.core.models.agenda.Agenda;
import com.dev.core.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, UUID> {
    
    Optional<Agenda> findByBarbeiro(User barbeiro);
}