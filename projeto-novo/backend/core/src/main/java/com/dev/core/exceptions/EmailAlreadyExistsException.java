package com.dev.core.exceptions;

public class EmailAlreadyExistsException extends RuntimeException {

    public EmailAlreadyExistsException() {
        super("This email already exists");
    }

    public EmailAlreadyExistsException(String message) {
        super(message);
    }
}
