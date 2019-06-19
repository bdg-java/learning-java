package com.bankaccountsystem;

public enum CountryCode {
    ARM("+374", Country.AM);

    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "CountryCode{" +
                "countryCode='" + countryCode + '\'' +
                ", country=" + country +
                '}';
    }
}
