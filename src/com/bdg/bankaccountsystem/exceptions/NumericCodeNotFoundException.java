package com.bdg.bankaccountsystem.exceptions;

public class NumericCodeNotFoundException extends RuntimeException {

    private final String message;

    public NumericCodeNotFoundException(String numericCode) {
        this.message = "Numeric code {" + numericCode + "} not found ...";
    }

    public String getMessage() {
        return this.message;
    }
}
