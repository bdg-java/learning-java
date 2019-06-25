package com.lesson11.exception;

public class AddreessNotCreated extends RuntimeException {
    private final String message;

    public AddreessNotCreated(String message) {
        this.message = "Address not created ( " + message + " )";
    }
}
