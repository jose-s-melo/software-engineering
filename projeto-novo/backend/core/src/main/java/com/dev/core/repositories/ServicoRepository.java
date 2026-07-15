package com.dev.core.repositories;

import com.dev.core.models.Servico;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, UUID> {}
