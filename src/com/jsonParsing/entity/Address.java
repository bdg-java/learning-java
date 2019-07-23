package com.jsonParsing.entity;


import com.jsonParsing.enums.Country;

import java.util.Arrays;

public class Address {
    private Country country;
    private String street;
    private PhoneNumber phonenumber[];

    public Address(Country country, String street, PhoneNumber[] phonenumber) {
        this.country = country;
        this.street = street;
        this.phonenumber = phonenumber;
    }

    public Country getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public PhoneNumber[] getPhonenumber() {
        return phonenumber;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPhonenumber(PhoneNumber[] phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Address [" + this.country + ", " + this.street + " , " + Arrays.toString(phonenumber) + "]";
    }
}


