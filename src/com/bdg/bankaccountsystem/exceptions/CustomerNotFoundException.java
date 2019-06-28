package com.bdg.bankaccountsystem.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    private final String message;

    public CustomerNotFoundException(int id) {
        this.message = "Customer with id {" + id + "} is not found ...";
    }

    public String getMessage() {
        return this.message;
    }

}
