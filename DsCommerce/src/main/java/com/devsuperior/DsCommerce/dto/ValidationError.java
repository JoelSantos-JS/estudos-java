package com.devsuperior.DsCommerce.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


public class ValidationError extends CustomError {

    public ValidationError(Instant timesstamp, Integer status, String error, String path) {
        super(timesstamp, status, error, path);
        //TODO Auto-generated constructor stub
    }

    private List<FieldMessage> errors = new ArrayList<>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add( new FieldMessage(fieldName, message));

    }

}
