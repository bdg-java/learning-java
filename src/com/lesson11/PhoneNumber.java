package com.lesson11;

public class PhoneNumber extends AbstractBankEntity {
    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber(int id, CountryCode countryCode, String number, PhoneType type) {
        super(id);
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }

    public String toString() {
        return this.countryCode + " , " + this.number + " , " + this.type;
    }
}
