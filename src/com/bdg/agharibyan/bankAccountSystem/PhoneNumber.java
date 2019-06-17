package com.bdg.agharibyan.bankAccountSystem;

public class PhoneNumber extends AbstractBankEntity{

    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType type, int id){
        super(id);
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }
}
