package ru.abizgildina.exceptions;

public class DocumentExistsException extends Exception {
    public DocumentExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}

