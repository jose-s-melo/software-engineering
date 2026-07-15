package com.dev.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidBarbershopException extends IllegalArgumentException {

    public InvalidBarbershopException() {
        super("Invalid barbershop field");
    }

    public InvalidBarbershopException(String message) {
        super(message);
    }
}
