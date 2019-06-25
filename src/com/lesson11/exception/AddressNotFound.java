package com.lesson11.exception;

public class AddressNotFound extends RuntimeException {
    private final String message;

    public AddressNotFound(int message) {
        this.message = "Address not found " + message + " ...";
    }

}
