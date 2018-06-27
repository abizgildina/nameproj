package ru.abizgildina.exceptions;

public class DocumentExistsException extends Exception {
    /**
     * Исключение на случай повтора рагистрационного номера
     * @param message
     * @param cause
     */
    public DocumentExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}

