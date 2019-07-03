package com.BankAccount.exception;

public class AbstractBankEntityObjectNotFound extends RuntimeException {
    private final String message;
    private static final String DEFAULT_MESSAGE = "AbstractBankEntity object not found ";

    public AbstractBankEntityObjectNotFound(int id) {

        this.message = DEFAULT_MESSAGE + id + "...";
    }

    public String getMessage() {
        return this.message;
    }
}
