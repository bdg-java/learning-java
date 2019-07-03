package com.BankAccount.exception;

public class CreditCardNotFoundException extends BankAccountException {

    private final String message;

    public CreditCardNotFoundException(int id) {
        this.message = "Credit Card with id {" + id + "} not found ...";
    }
    public String getMessage() {
        return this.message;
    }
}
