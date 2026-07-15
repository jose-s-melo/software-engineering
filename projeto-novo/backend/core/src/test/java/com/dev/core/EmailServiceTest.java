package com.dev.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.dev.core.dtos.email.SendEmailDTO;
import com.dev.core.mappers.EmailMapper;
import com.dev.core.models.email.Email;
import com.dev.core.models.email.StatusEmail;
import com.dev.core.repositories.EmailRepository;
import com.dev.core.services.email.EmailService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * Testes unitários para EmailService.
 *
 * <p>Técnica: Caixa Branca — o campo emailFrom é injetado via @Value e precisa ser setado
 * manualmente via ReflectionTestUtils (mesmo padrão aplicado em TokenServiceTest). Cobre o caminho
 * feliz (envio OK) e o caminho de erro (MailException capturada e status ERROR persistido mesmo
 * assim).
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("EmailService")
class EmailServiceTest {

    private static final String EMAIL_FROM = "no-reply@barbearia.com";

    @Mock private EmailRepository repository;

    @Mock private JavaMailSender mailSender;

    @Mock private EmailMapper mapper;

    @InjectMocks private EmailService emailService;

    @BeforeEach
    void setUp() {
        ReflectionTestUtils.setField(emailService, "emailFrom", EMAIL_FROM);
    }

    private Email buildEmailEntity() {
        return Email.builder()
                .emailTo("cliente@email.com")
                .subject("Código para mudar senha")
                .text("1234")
                .build();
    }

    @Nested
    @DisplayName("sendEmail - caminho feliz")
    class CaminhoFeliz {

        @Test
        @DisplayName("deve enviar o e-mail, marcar status SENT e persistir")
        void deveEnviarMarcarSentEPersistir() {
            SendEmailDTO dto =
                    new SendEmailDTO("cliente@email.com", "1234", "Código para mudar senha");
            Email email = buildEmailEntity();
            when(mapper.toEntity(dto)).thenReturn(email);
            when(repository.save(any(Email.class))).thenAnswer(inv -> inv.getArgument(0));

            Email resultado = emailService.sendEmail(dto);

            assertThat(resultado.getStatusEmail()).isEqualTo(StatusEmail.SENT);
            assertThat(resultado.getEmailFrom()).isEqualTo(EMAIL_FROM);
            assertThat(resultado.getSendDateEmail()).isNotNull();
            verify(mailSender, times(1)).send(any(SimpleMailMessage.class));
        }

        @Test
        @DisplayName("deve montar a SimpleMailMessage com destinatário, assunto e texto corretos")
        void deveMontarMensagemComCamposCorretos() {
            SendEmailDTO dto =
                    new SendEmailDTO("cliente@email.com", "1234", "Código para mudar senha");
            Email email = buildEmailEntity();
            when(mapper.toEntity(dto)).thenReturn(email);
            when(repository.save(any(Email.class))).thenAnswer(inv -> inv.getArgument(0));

            emailService.sendEmail(dto);

            ArgumentCaptor<SimpleMailMessage> captor =
                    ArgumentCaptor.forClass(SimpleMailMessage.class);
            verify(mailSender).send(captor.capture());
            SimpleMailMessage mensagem = captor.getValue();
            assertThat(mensagem.getTo()).containsExactly("cliente@email.com");
            assertThat(mensagem.getSubject()).isEqualTo("Código para mudar senha");
            assertThat(mensagem.getText()).isEqualTo("1234");
        }
    }

    @Nested
    @DisplayName("sendEmail - falha no envio")
    class FalhaNoEnvio {

        @Test
        @DisplayName("deve marcar status ERROR e ainda assim persistir quando o envio falhar")
        void deveMarcarErrorEPersistirMesmoAssim() {
            SendEmailDTO dto = new SendEmailDTO("invalido@email.com", "1234", "Assunto");
            Email email = buildEmailEntity();
            when(mapper.toEntity(dto)).thenReturn(email);
            doThrow(new MailSendException("Falha ao enviar"))
                    .when(mailSender)
                    .send(any(SimpleMailMessage.class));
            when(repository.save(any(Email.class))).thenAnswer(inv -> inv.getArgument(0));

            Email resultado = emailService.sendEmail(dto);

            assertThat(resultado.getStatusEmail()).isEqualTo(StatusEmail.ERROR);
            verify(repository, times(1)).save(email);
        }
    }
}
