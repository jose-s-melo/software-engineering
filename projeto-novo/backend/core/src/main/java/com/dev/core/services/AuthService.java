package com.dev.core.services;

import com.dev.core.dtos.auth.TokenResponseDTO;
import com.dev.core.dtos.auth.UserResponseDTO;
import com.dev.core.models.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.dev.core.repositories.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserService userService;

    public TokenResponseDTO login(String email, String password) {
        TokenResponseDTO response;
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(email, password);
        Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        String token = tokenService.generateToken((UserDetails) authentication.getPrincipal());

        if (token != null) {
            User user = (User) authentication.getPrincipal();
            System.out.println("logou");
            response = new TokenResponseDTO(token, "Success", new UserResponseDTO(user.getId(), user.getEmail(), user.getRole()));
        } else {
            System.out.println("não logou");
            response = new TokenResponseDTO(token, "Failed", null);
        }

        return response;
    }

    public void register(String email, String password) {
        userService.addUser(email, password);
    }

}
