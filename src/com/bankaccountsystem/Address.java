package com.bankaccountsystem;

public class Address {
    private Country country;
    private String street;
    private PhoneNumber[] phoneNumber;

    public Address(Country country, String street, PhoneNumber[] phoneNumber) {
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }
}
