package com.bdg.bankaccountsystem;

public enum CountryCode {
    ARM ("+374", Country.AM),
    AUS ("+61", Country.AU),
    JAM ("+1-876", Country.JM);

    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }

}
