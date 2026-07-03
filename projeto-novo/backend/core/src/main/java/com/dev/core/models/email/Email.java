package com.dev.core.models.email;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@Entity
@Table(name = "email")
@AllArgsConstructor
@NoArgsConstructor
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "email_from", nullable = false)
    private String emailFrom;

    @Column(name = "email_to", nullable = false)
    private String emailTo;

    @Column(columnDefinition = "TEXT", name = "text", nullable = false)
    private String text;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "send_date_email", nullable = false)
    private LocalDateTime sendDateEmail;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_email", nullable = false)
    private StatusEmail statusEmail;

}