package com.bdg.jsonHomework;
import com.bdg.jsonHomework.enums.CountryCode;
import com.bdg.jsonHomework.enums.PhoneType;


class PhoneNumber {
    private CountryCode countryCode;
    private String number;
    private PhoneType phoneType;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType phoneType) {
        this.countryCode = countryCode;
        this.number = number;
        this.phoneType = phoneType;
    }


    //Getters


    public CountryCode getCountryCode() {
        return countryCode;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public String getNumber() {
        return number;
    }
}