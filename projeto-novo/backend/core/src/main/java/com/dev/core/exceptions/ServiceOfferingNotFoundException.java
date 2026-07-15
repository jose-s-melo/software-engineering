package com.dev.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ServiceOfferingNotFoundException extends RuntimeException {

    public ServiceOfferingNotFoundException() {
        super("Service offering not found");
    }

    public ServiceOfferingNotFoundException(String message) {
        super(message);
    }
}
