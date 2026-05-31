package com.dev.core.exceptions;

public class BarbershopNotFoundException extends RuntimeException{
    public static final String DEFAULT_MESSAGE = "Barber shop not found";

    public BarbershopNotFoundException() {
        super(DEFAULT_MESSAGE);
    }

    public BarbershopNotFoundException(String message) {
        super(message);
    }
}
