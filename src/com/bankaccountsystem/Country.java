package com.bankaccountsystem;

public enum Country {
    AM("Armenia", "051");

    private String countryName;
    private String numericCode;

    Country(String countryName, String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }
}
