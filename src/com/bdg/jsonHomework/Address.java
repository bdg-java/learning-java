package com.bdg.jsonHomework;
import com.bdg.BankAccountSystem.PhoneNumber;
import com.bdg.jsonHomework.enums.Country;

import java.util.List;

class Address {
    private Country country; //Country-n enum e
    private String street;
    private List<PhoneNumber> phoneNumbers;

    public Address(Country country, String street, List<PhoneNumber> phoneNumbers) {
        this.country = country;
        this.street = street;
        this.phoneNumbers = phoneNumbers;
    }

    //Getters

    public Country getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }
}