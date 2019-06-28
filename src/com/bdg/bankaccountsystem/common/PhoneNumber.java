package com.bdg.bankaccountsystem.common;

import com.bdg.bankaccountsystem.AbstractBankEntity;

public class PhoneNumber extends AbstractBankEntity {
    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType type) {
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CountryCode getCountryCode() {
        return this.countryCode;
    }

    public PhoneType getType() {
        return this.type;
    }
}
