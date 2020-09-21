package com.example.todoapp.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Object> handle(Exception e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
