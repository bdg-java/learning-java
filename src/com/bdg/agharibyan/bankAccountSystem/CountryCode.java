package com.bdg.agharibyan.bankAccountSystem;

public enum CountryCode {
    ARM("374", Country);

    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country){
        this.countryCode = countryCode;
        this.country = country;
    }
}
