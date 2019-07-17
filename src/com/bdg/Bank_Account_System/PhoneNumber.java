package com.bdg.Bank_Account_System;

public class PhoneNumber extends AbstractBankEntity {

    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber(int id,CountryCode countryCode, String number, PhoneType type) {
        super(id);
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }
}
