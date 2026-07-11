package com.dev.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.dev.core.dtos.LoginRequestDTO;
import com.dev.core.dtos.RegisterRequestDTO;

@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserService userService;

    public String login(LoginRequestDTO dto) {
        String email = dto.email();
        String password = dto.password();
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(email, password);
        Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        return tokenService.generateToken((UserDetails) authentication.getPrincipal());
    }

    public void register(RegisterRequestDTO data) {
        userService.addUser(data);
    }
}