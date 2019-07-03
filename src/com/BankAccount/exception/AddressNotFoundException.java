package com.BankAccount.exception;

public class AddressNotFoundException extends BankAccountException {
    private final String message;

    public AddressNotFoundException(int message) {
        this.message = "Address not found " + message + " ...";
    }

}
