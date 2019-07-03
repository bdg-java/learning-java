package com.BankAccount.dbo;

import com.BankAccount.common.Country;
import com.BankAccount.entity.PhoneNumber;

public class AddressCreationRequest {
    public Country country;
    public String street;
    public PhoneNumber phonenumber[];

    public AddressCreationRequest(Country country, String street, PhoneNumber[] phonenumber) {
        this.country = country;
        this.street = street;
        this.phonenumber = phonenumber;
    }
}
