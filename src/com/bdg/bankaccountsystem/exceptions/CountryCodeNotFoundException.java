package com.bdg.bankaccountsystem.exceptions;

public class CountryCodeNotFoundException extends RuntimeException {

    private final String message;

    public CountryCodeNotFoundException(String countryCode) {

        this.message = "Country code {" + countryCode + "} is not found ...";
    }

    public String getMessage() {

        return this.message;
    }
}
