package com.dev.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.core.models.user.User;

public interface UserRepository extends JpaRepository<User, String> {

}
