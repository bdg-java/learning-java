package com.bdg.bankaccountsystem.common;

import com.bdg.bankaccountsystem.exceptions.CountryCodeNotFoundException;

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

    public CountryCode findByCountryCode(String countryCode) {
        CountryCode found = null;
        for (CountryCode value: values()) {
            if (value.name().equalsIgnoreCase(countryCode)) {
                found = value;
            }
        }
        if (found == null) {
            throw new CountryCodeNotFoundException(countryCode);
        }
        return found;
    }

}
