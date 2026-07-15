package com.dev.core.repositories;

import com.dev.core.models.agenda.Agenda;
import com.dev.core.models.user.User;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, UUID> {

    Optional<Agenda> findByBarbeiro(User barbeiro);
}
