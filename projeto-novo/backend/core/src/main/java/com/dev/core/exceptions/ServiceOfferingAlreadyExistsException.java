package com.dev.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ServiceOfferingAlreadyExistsException extends RuntimeException {

    public ServiceOfferingAlreadyExistsException() {
        super("Service already exists");
    }
    public ServiceOfferingAlreadyExistsException(String message) {
        super(message);
    }
}
