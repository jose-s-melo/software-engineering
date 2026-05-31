package com.dev.core.exceptions;

public class InvalidBarbershopException extends IllegalArgumentException{
    public static final String DEFAULT_MESSAGE = "Invalid barbershop field";

    public InvalidBarbershopException() {
        super(DEFAULT_MESSAGE);
    }

    public InvalidBarbershopException(String message) {
        super(message);
    }
}
