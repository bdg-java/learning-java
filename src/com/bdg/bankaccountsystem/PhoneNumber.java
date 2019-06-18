package com.bdg.bankaccountsystem;

public class  PhoneNumber {
    private CountryPhoneCode countryPhoneCode;
    private String number;
    private PhoneType type;
    public PhoneNumber(CountryPhoneCode countryPhoneCode, String number, PhoneType type){
            this.countryPhoneCode = countryPhoneCode;
            this.number = number;
            this.type = type;
    }

    public CountryPhoneCode getCountryPhoneCode() {
        return countryPhoneCode;
    }

    public void setCountryPhoneCode(CountryPhoneCode countryPhoneCode) {
        this.countryPhoneCode = countryPhoneCode;
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
