package com.dev.core.services;

import com.dev.core.dtos.*;
import com.dev.core.models.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserService userService;

    public TokenResponseDTO login(LoginRequestDTO dto) {
        String email = dto.email();
        String password = dto.password();
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(email, password);
        Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        User user = (User) authentication.getPrincipal();
        return new TokenResponseDTO(tokenService.generateToken((UserDetails) authentication.getPrincipal()), "Success", new UserResponseDTO(user.getId(), user.getEmail(), user.getRole()));
    }

    public void register(RegisterRequestDTO data) {
        userService.addUser(data);
    }

    public UserResponseDTO changePassword(ChangePasswordRequestDTO dto) {
        return userService.changePassword(dto);
    }
}