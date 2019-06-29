package com.bdg.agharibyan.bankaccountsystem.common.exception;

public class CountryCodeNotFoundException extends RuntimeException{

    private final String DEFAULT_MESSAGE = "Phone number not found with Country Code %s";
    private final String message;

    public CountryCodeNotFoundException(String countryCode){
        this.message = String.format(DEFAULT_MESSAGE, countryCode);
    }

    public String getMessage(){
        return this.message;
    }
}
