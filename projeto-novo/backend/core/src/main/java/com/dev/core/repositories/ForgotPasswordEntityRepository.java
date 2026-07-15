package com.dev.core.repositories;

import com.dev.core.models.ForgotPasswordEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForgotPasswordEntityRepository extends JpaRepository<ForgotPasswordEntity, UUID> {

    Optional<ForgotPasswordEntity> findByEmail(String email);
}
