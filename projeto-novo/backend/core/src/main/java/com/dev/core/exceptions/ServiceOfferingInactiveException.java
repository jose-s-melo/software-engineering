package com.dev.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ServiceOfferingInactiveException extends RuntimeException {

    public ServiceOfferingInactiveException() {
        super("Service offering is inactive");
    }

    public ServiceOfferingInactiveException(String message) {
        super(message);
    }
}