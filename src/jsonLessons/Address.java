package jsonLessons;

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

    public String getStreet() {
        return street;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Address [" + this.country + ", " + this.street + " , " + this.phoneNumbers + "]";
    }
}
