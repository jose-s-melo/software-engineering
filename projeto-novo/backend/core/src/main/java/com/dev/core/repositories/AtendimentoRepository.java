package com.dev.core.repositories;

import com.dev.core.models.Atendimento;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<Atendimento, UUID> {}
