package com.dev.core.dtos.email;

import com.dev.core.models.email.Email;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/** DTO for {@link Email} */
@Schema(description = "Dados necessários para o envio de uma notificação por e-mail.")
public record SendEmailDTO(
        @Schema(description = "Endereço de e-mail do destinatário.", example = "usuario@email.com")
                String emailTo,
        @Schema(
                        description = "Conteúdo da mensagem que será enviada ao usuário.",
                        example = "Seu agendamento foi confirmado com sucesso.")
                String text,
        @Schema(description = "Assunto do e-mail.", example = "Confirmação de Agendamento")
                String subject)
        implements Serializable {}
