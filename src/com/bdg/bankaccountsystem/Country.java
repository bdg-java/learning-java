package com.bdg.bankaccountsystem;

public enum Country {
    AM("Armenia", "051"),
    JM("Jamaica", "388"),
    AU("Australia", "533");

    private String countryName;
    private String numericCode;

    Country(String countryName, String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }
}
