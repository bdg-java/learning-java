package com.lesson11;

public enum CountryCode {
    ARM("+374", Country.AM),
    CH("+156", Country.CN),
    AU("+36", Country.AU),
    RU("+742", Country.RU);

    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return this.country + " ( " + this.countryCode + " )";
    }
}
