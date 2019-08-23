package com.bdg.bankaccountsystem.customer_info;

import com.bdg.bankaccountsystem.BankEntity;
import com.bdg.bankaccountsystem.customer_info.Country;
import com.bdg.bankaccountsystem.customer_info.PhoneNumber;

public class Address extends BankEntity {
    private Country country;
    private String street;
    private PhoneNumber[] phoneNumber;

    public Address(Country country, String street, PhoneNumber [] phoneNumber) {
        int num = 0;
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
        /*if (this.phoneNumber!=null){
            num++;
        }*/


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

    public PhoneNumber[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
