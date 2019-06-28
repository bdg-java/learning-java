package com.bdg.bankaccountsystem.common;

import com.bdg.bankaccountsystem.exceptions.NumericCodeNotFoundException;

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

    public Country findByNumericCode (String numericCode) {
        Country found = null;

        for (Country value:values()) {
        if (value.name().equalsIgnoreCase(numericCode)) {
            found = value;
           }
        }
        if (found == null) {
            throw new NumericCodeNotFoundException(numericCode);
        }
        return found;
    }
}
