package com.bdg.bankaccountsystem;

public class Address {

    private Country country;
    private String street;
    private PhoneNumber phoneNumber;
     Address(Country country,String street,
                   PhoneNumber phoneNumber
                   ){
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}