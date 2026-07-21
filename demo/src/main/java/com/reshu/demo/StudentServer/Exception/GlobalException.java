package com.reshu.demo.StudentServer.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    // Unchecked Exception Handler (RuntimeException)
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleUncheckedException(RuntimeException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("Unchecked Exception: " + e.getMessage());
    }

    // Checked Exception Handler (Exception)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleCheckedException(Exception e) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Checked Exception: " + e.getMessage());
    }
}