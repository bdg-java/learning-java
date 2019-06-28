package com.bdg.bankaccountsystem.common;

public class PhoneNumber {
    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    PhoneNumber(CountryCode countryCode, String number, PhoneType type) {
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }
}
