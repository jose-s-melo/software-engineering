package com.dev.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidServiceOfferingException extends RuntimeException {

    public InvalidServiceOfferingException() {
        super("Invalid offering service data");
    }

    public InvalidServiceOfferingException(String message) {
        super(message);
    }
}