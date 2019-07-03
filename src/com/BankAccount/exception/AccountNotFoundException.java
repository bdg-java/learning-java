package com.BankAccount.exception;

public class AccountNotFoundException extends BankAccountException {
    private final String message;

    public AccountNotFoundException(int message) {
        this.message = "Account not found " + message + " ...";
    }
}
