package com.upgrad.eshop.exceptions;

public class EshopOrderDetailsNotFoundException extends Exception{
    public EshopOrderDetailsNotFoundException() {
    }

    public EshopOrderDetailsNotFoundException(String message) {
        super(message);
    }

    public EshopOrderDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EshopOrderDetailsNotFoundException(Throwable cause) {
        super(cause);
    }

    public EshopOrderDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
