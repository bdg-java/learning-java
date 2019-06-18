package com.bdg.bankaccountsystem;

public enum Country {
    AM("Armenia","051");
     String countryName;
     String numericCode;

    Country(String countryname, String numericCode) {
        this.countryName = countryname;
        this.numericCode = numericCode;
    }
}
