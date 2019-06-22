package com.bdg.agharibyan.bankaccountsystem;

public class Address extends AbstractBankEntity{

    private Country country;
    private String street;
    private PhoneNumber[] phoneNumber;

    public Address(Country country, String street, PhoneNumber[] phoneNumber, int id){
        super(id);
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }

    public Country getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public PhoneNumber[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPhoneNumber(PhoneNumber[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
