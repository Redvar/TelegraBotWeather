package com.konoplin.telegrambotweather.exception;

public class ApiVersionException extends Exception {

    public ApiVersionException() {
    }

    public ApiVersionException(String message) {
        super(message);
    }

    public ApiVersionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiVersionException(Throwable cause) {
        super(cause);
    }

    public ApiVersionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
