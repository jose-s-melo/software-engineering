package com.dev.core.serializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.Duration;

public class DurationHHMMDeserializer extends JsonDeserializer<Duration> {

    @Override
    public Duration deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String texto = p.getText();
        String[] partes = texto.split(":");

        if (partes.length != 2) {
            throw new IllegalArgumentException("Formato inválido para duração, esperado HH:mm. Valor recebido: " + texto);
        }

        long horas = Long.parseLong(partes[0]);
        long minutos = Long.parseLong(partes[1]);

        return Duration.ofHours(horas).plusMinutes(minutos);
    }
}
