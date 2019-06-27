package com.bdg.bank;

public enum  CountryCode {
    ARM("+374", Country.AM),
    UK("+44", Country.UK);


    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return this.countryCode + ", " + this.country;
    }
}