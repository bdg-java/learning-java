package com.bdg.agharibyan.json.address;

import com.bdg.agharibyan.bankaccountsystem.common.type.Country; // bankaccountsystemic import anelov kndir chem steghtsum che?
import com.bdg.agharibyan.bankaccountsystem.entity.PhoneNumber;

import java.util.List;

public class Address {
    private Country country; //Country-n enum e
    private String street;
    private List<PhoneNumber> phoneNumbers;

    public Address(Country country, String street, List<PhoneNumber> phoneNumbers) {
        this.country = country;
        this.street = street;
        this.phoneNumbers = phoneNumbers;
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

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbera(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

}
