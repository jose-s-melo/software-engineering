package com.dev.core.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.core.models.ForgotPasswordEntity;

public interface ForgotPasswordEntityRepository extends JpaRepository<ForgotPasswordEntity, UUID>{

    Optional<ForgotPasswordEntity> findByEmail(String email);
}
