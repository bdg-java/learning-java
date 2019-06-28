package com.bdg.bankaccountsystem.common;

import com.bdg.bankaccountsystem.AbstractBankEntity;

public class Address extends AbstractBankEntity {
    private Country country;
    private String street;
    private String phoneNumber;

    public Address (Country country, String street, String phoneNumber) {
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.street = street;
    }

    public Country getCountry() {
        return this.country;
    }

    public String getStreet() { return this.street; }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
