package com.devsuperior.DsCommerce.controllers.handlers;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.DsCommerce.dto.CustomError;
import com.devsuperior.DsCommerce.services.exceptions.ResourceNotFound;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<CustomError> resourceNotFoundException(ResourceNotFound e , HttpServletRequest request) {
       HttpStatus status = HttpStatus.NOT_FOUND;
       CustomError err = new CustomError(Instant.now(), status.value(),  e.getMessage(), request.getRequestURI());

       return  ResponseEntity.status(status).body(err);
    }

}