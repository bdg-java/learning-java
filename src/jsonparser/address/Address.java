package jsonparser.address;

import jsonparser.enums.Country;

import java.util.List;

public class Address {
    private Country country;
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

    public String getStreet() {
        return street;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }
}