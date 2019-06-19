package com.bdg.bankaccountsystem;

public enum CountryCode {
     ARM("+374" ,Country.AM),
     RUS("+007",Country.RU),
     USA("+1", Country.US);
    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }

    CountryCode() {

    }
}
