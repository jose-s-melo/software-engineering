package com.dev.core.repositories;

import com.dev.core.models.email.Email;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, UUID> {}
