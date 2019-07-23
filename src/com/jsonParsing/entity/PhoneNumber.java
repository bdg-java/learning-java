package com.jsonParsing.entity;


import com.jsonParsing.enums.CountryCode;
import com.jsonParsing.enums.PhoneType;

public class PhoneNumber {
    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType type) {
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }


    public String toString() {
        return this.countryCode + " , " + this.number + " , " + this.type;
    }
}
