package com.dev.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BarbershopNotFoundException extends RuntimeException {

    public BarbershopNotFoundException() {
        super("Barber shop not found");
    }

    public BarbershopNotFoundException(String message) {
        super(message);
    }
}
