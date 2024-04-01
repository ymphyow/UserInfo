package com.electricsystem.user.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/** Global Exception Handler */
public class GlobalException extends ResponseStatusException {
    /**
     * @param status status code to be returned for the error
     * @param message message to be returned for the error
     */
    public GlobalException(HttpStatus status, String message) {
        super(status, message);
    }

    /**
     * @param status status code to be returned for the error
     * @param message message to be returned for the error
     * @param e Error or Exception thrown
     */
    public GlobalException(HttpStatus status, String message, Throwable e) {
        super(status, message, e);
    }
}