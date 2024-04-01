package com.electricsystem.user.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<String> responseGlobalException(GlobalException globalException) {
        return ResponseEntity.status(globalException.getStatusCode())
                .body(globalException.getMessage());
    }
}