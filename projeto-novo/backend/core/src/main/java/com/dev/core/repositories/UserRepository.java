package com.dev.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.core.models.User;

public interface UserRepository extends JpaRepository<User, String> {

}
