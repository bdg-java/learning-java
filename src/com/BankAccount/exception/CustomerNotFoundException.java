package com.BankAccount.exception;

public class CustomerNotFoundException extends BankAccountException {
    private final String message;

    public CustomerNotFoundException(int message) {
        this.message = "Customer not found " + message + " ...";
    }
}

