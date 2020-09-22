package com.upgrad.eshop.exceptions;

public class EshopUserDetailsNotFoundException extends Exception{

    public EshopUserDetailsNotFoundException() {
    }

    public EshopUserDetailsNotFoundException(String message) {
        super(message);
    }

    public EshopUserDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EshopUserDetailsNotFoundException(Throwable cause) {
        super(cause);
    }

    public EshopUserDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
