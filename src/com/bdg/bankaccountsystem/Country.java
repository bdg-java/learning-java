package com.bdg.bankaccountsystem;

public enum Country {
    AM("Armenia","051"),
    RU("Russia","643"),
    US("United States of America","840");
     String countryName;
     String numericCode;

    Country(String countryname, String numericCode) {
        this.countryName = countryname;
        this.numericCode = numericCode;
    }
}
