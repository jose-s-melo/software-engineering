package com.dev.core.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.core.models.user.User;
import com.dev.core.models.user.UserRole;

public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmail(String email);
    List<User> findAllByRole(UserRole role);

    Optional<User> findByIdAndRole(UUID id, UserRole role);
  
}
