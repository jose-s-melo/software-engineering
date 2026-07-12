package com.dev.core.services;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.dev.core.dtos.ChangePasswordRequestDTO;
import com.dev.core.dtos.ConfirmForgotPasswordRequestDTO;
import com.dev.core.dtos.ForgotPasswordRequestDTO;
import com.dev.core.dtos.LoginRequestDTO;
import com.dev.core.dtos.RegisterRequestDTO;
import com.dev.core.dtos.TokenResponseDTO;
import com.dev.core.dtos.UserResponseDTO;
import com.dev.core.dtos.email.SendEmailDTO;
import com.dev.core.models.ForgotPasswordEntity;
import com.dev.core.models.user.User;
import com.dev.core.repositories.ForgotPasswordEntityRepository;
import com.dev.core.services.email.EmailService;

@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserService userService;

    @Autowired
    private EmailService emailService;

    @Autowired
    private ForgotPasswordEntityRepository forgotPasswordEntityRepository;

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

    public void forgotPassword(ForgotPasswordRequestDTO body) {
        invalidateCodes();
        
        int length = 4;
        String permittedChars = "0123456789";

        SecureRandom random = new SecureRandom();

        String randomCode = random.ints(length, 0, permittedChars.length())
            .mapToObj(permittedChars::charAt)
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();

        emailService.sendEmail(new SendEmailDTO(body.email(), randomCode, "Código para mudar senha"));

        ForgotPasswordEntity forgotPasswordEntity = ForgotPasswordEntity.builder()
                                                                        .code(randomCode)
                                                                        .email(body.email())
                                                                        .createdAt(Instant.now())
                                                                        .build();

        forgotPasswordEntityRepository.save(forgotPasswordEntity);
    }

    public void confirmForgotPassword(ConfirmForgotPasswordRequestDTO body) {
        invalidateCodes();

        ForgotPasswordEntity forgotPasswordEntity = forgotPasswordEntityRepository.findByEmail(body.email()).orElseThrow(() -> new RuntimeException());

        if (forgotPasswordEntity.getCode().equals(body.code())) {
            userService.changeForgotPassword(body.email(), body.newPassword());

            forgotPasswordEntityRepository.deleteById(forgotPasswordEntity.getId());
        } else {
            throw new RuntimeException("Código inválido");
        }
    }

    private void invalidateCodes() {
        List<ForgotPasswordEntity> all = forgotPasswordEntityRepository.findAll();

        for (ForgotPasswordEntity forgotPasswordEntity : all) {
            Duration duration = Duration.between(forgotPasswordEntity.getCreatedAt(), Instant.now());

            if (duration.toMinutes() >= 2) {
                forgotPasswordEntityRepository.deleteById(forgotPasswordEntity.getId());
            }
        }
    }


}