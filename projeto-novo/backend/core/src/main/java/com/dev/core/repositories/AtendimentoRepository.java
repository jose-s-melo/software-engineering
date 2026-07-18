package com.dev.core.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.core.models.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, UUID>{

    List<Atendimento> findByEmailClient(String emailClient);

}
