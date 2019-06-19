package com.bdg.bankaccountsystem;

public class Address extends AbstractBankEntity{
    private Country country;
    private String street;
    private PhoneNumber[] phoneNumber;

    public Address (Country country, String street, PhoneNumber[] phoneNumber, int id) {
        super(id);
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.street = street;
    }

    public Country getCountry() {
        return this.country;
    }

    public String getStreet() { return this.street; }

    public PhoneNumber[] getPhoneNumber() {
        return this.phoneNumber;
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
