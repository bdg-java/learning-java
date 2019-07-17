package com.bdg.Bank_Account_System;

public enum Country {
    AM("Armenia", "051"),
    FR("FRANCE","054"),
    CN("China","087");

    private String countryName;
    private String numericcode;

    Country(String countryName, String numericcode) {
        this.countryName = countryName;
        this.numericcode = numericcode;
    }

}
