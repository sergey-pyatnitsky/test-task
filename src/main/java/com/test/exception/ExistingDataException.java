package com.test.exception;

public class ExistingDataException extends RuntimeException{

    public ExistingDataException(String message) {
        super(message);
    }
}
