package com.bdg.bankaccountsystem.customer_info;

public enum CountryCode {
     ARM("+374" , Country.AM),
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
