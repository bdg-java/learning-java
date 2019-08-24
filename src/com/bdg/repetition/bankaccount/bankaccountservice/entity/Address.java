package com.bdg.repetition.bankaccount.bankaccountservice.entity;

import com.bdg.repetition.bankaccount.bankaccountservice.common.Country;

public class Address extends AbstractBankEntity {

    private Country country;
    private String city;
    private String street;
    private int homeNumber;
    private String phoneNumber;

    public Address(Country country, String city, String street, int homeNumber, String phoneNumber){
        this.country = country;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.phoneNumber = phoneNumber;
    }
}
