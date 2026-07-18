package com.dev.core.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.core.exceptions.UserNotFoundException;
import com.dev.core.models.user.User;
import com.dev.core.models.user.UserRole;
import com.dev.core.repositories.UserRepository;

@RestController
@RequestMapping("/api/sudo")
public class AdminPanelController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @PostMapping("/changeUserPassword/{id}")
    public ResponseEntity<Void> changeUserPassword(@PathVariable UUID userId, @AuthenticationPrincipal User user, @RequestParam String newPassword) {
        
        if (user.getRole() == UserRole.ADMIN) {

            User usr = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException());
            
            usr.setPassword(passwordEncoder.encode(newPassword));
        }


        return ResponseEntity.noContent().build();
    }

    @PostMapping("/changeUserRole/{id}")
    public ResponseEntity<Void> changeUserRole(@PathVariable UUID userId, @AuthenticationPrincipal User user,
            @RequestParam UserRole userRole) {

        if (user.getRole() == UserRole.ADMIN) {

            User usr = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException());

            usr.setRole(userRole);
        }

        return ResponseEntity.noContent().build();
    }
}
