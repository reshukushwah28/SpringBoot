package com.reshu.demo.StudentServer.Exception;

import com.reshu.demo.StudentServer.DTO.ExceptionResponseDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalException {

    // Runtime Exception Handler
//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<String> handleRuntimeException(RuntimeException e) {
//
//        return ResponseEntity
//                .status(HttpStatus.INTERNAL_SERVER_ERROR)
//                .body(e.getMessage());
//    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionResponseDTO> handleRuntimeException(RuntimeException e, HttpServletRequest req) {
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                e.getMessage(),
                req.getRequestURI()
        );
        return ResponseEntity
                .status(500)
                .body(exceptionResponseDTO);
    }

    // Checked Exception Handler
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleStudentCheckedException(Exception e) {

        return ResponseEntity
                .status(500)
                .body(e.getMessage());
    }
}