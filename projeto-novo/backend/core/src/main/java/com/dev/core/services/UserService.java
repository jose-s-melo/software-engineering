package com.dev.core.services;

import com.dev.core.dtos.RegisterRequestDTO;
import com.dev.core.exceptions.EmailAlreadyExistsException;
import com.dev.core.exceptions.InvalidUserException;
import com.dev.core.exceptions.UserNotFoundException;
import com.dev.core.models.user.User;
import com.dev.core.models.user.UserRole;
import com.dev.core.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public User addUser(RegisterRequestDTO data) {
        String normalizedEmail = normalizeEmail(data.email());

        if (userRepository.findByEmail(normalizedEmail).isPresent()) {
            throw new EmailAlreadyExistsException();
        }

        User user = new User();
        user.setName(data.name());
        user.setEmail(normalizedEmail);
        user.setPassword(encoder.encode(data.password()));
        user.setPhone(data.phone());

        user.setRole(UserRole.CLIENTE);

        user = userRepository.save(user);

        return user;
    }

    public User updateUser(UUID userId, String email, String password) {
        User user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);

        if (!StringUtils.hasText(email)) {
            throw new InvalidUserException("O email não pode ser vazio.");
        }

        String normalizedEmail = normalizeEmail(email);

        userRepository.findByEmail(normalizedEmail).ifPresent(existing -> {
            if (!existing.getId().equals(userId)) {
                throw new EmailAlreadyExistsException();
            }
        });

        user.setEmail(normalizedEmail);
        user.setPassword(encoder.encode(password));

        user = userRepository.save(user);

        return user;
    }

    public void deleteUser(UUID userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
        } else {
            throw new UserNotFoundException();
        }
    }

    public User getUser(UUID userId) {
        return userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
    }

    private String normalizeEmail(String email) {
        if (email == null) {
            return null;
        }
        return email.trim().toLowerCase();
    }
}