package com.upgrad.eshop.exceptions;

public class UserAlreadyExistsException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public UserAlreadyExistsException(String exception) {
        super(exception);
    }
}
