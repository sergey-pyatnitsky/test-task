package com.test.exception;

public class IncorrectDataException extends RuntimeException{

    public IncorrectDataException(String message) {
        super(message);
    }
}
