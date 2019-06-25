package com.lesson11.exception;

public class CreditCardNotFoundException extends RuntimeException {

    private final String message;

    public CreditCardNotFoundException(int id) {

        this.message = "Credit Card with id {" + id + "} not found ...";
    }

    public String getMessage() {
        return this.message;
    }
}
