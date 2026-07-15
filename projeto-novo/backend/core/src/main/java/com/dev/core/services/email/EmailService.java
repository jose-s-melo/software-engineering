package com.dev.core.services.email;

import com.dev.core.dtos.email.SendEmailDTO;
import com.dev.core.mappers.EmailMapper;
import com.dev.core.models.email.Email;
import com.dev.core.models.email.StatusEmail;
import com.dev.core.repositories.EmailRepository;
import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired private EmailRepository repository;

    @Autowired private JavaMailSender mailSender;

    @Autowired private EmailMapper mapper;

    @Value("${MAIL_USERNAME:no-reply@localhost}")
    private String emailFrom;

    @Transactional
    public Email sendEmail(SendEmailDTO dto) {

        Email email = mapper.toEntity(dto);

        email.setSendDateEmail(LocalDateTime.now());
        email.setEmailFrom(emailFrom);

        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(email.getEmailTo());
            message.setSubject(email.getSubject());
            message.setText(email.getText());

            mailSender.send(message);

            email.setStatusEmail(StatusEmail.SENT);

        } catch (MailException e) {
            email.setStatusEmail(StatusEmail.ERROR);
        }

        return repository.save(email);
    }
}
