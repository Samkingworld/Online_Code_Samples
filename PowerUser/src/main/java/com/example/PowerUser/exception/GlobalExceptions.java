package com.example.PowerUser.exception;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptions {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleExceptions( Exception exception ){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("There has been an internal server error");
    }

    @ExceptionHandler( ResourceNotFoundException.class )
    public ResponseEntity<String> handleResourceNotFound( ResourceNotFoundException resourceNotFoundException ){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource could not be found");
    }

}
