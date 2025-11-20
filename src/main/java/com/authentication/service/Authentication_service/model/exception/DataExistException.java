package com.authentication.service.Authentication_service.model.exception;

public class DataExistException extends RuntimeException {
    public DataExistException(String message) {
        super(message);
    }
}
