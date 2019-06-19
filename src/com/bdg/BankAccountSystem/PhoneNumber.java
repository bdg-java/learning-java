package com.bdg.BankAccountSystem;

public class PhoneNumber extends AbstractBankEntery {

   private CountryCode countryCode;
   private String number;
   private PhoneType phoneType;


    public PhoneNumber(int id,CountryCode countryCode, String number, PhoneType phoneType) {
        super(id);
        this.countryCode = countryCode;
        this.number = number;
        this.phoneType = phoneType;
    }
}
