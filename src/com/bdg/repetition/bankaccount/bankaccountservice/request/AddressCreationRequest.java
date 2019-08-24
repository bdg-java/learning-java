package com.bdg.repetition.bankaccount.bankaccountservice.request;

public class AddressCreationRequest {

    public String countryName;
    public String cityName;
    public String street;
    public int homeNumber;
    public String phoneNumber;

    public AddressCreationRequest(String countryName, String cityName, String street, int homeNumber, String phoneNumber){
        this.countryName = countryName;
        this.cityName = cityName;
        this.street = street;
        this.homeNumber = homeNumber;
        this.phoneNumber = phoneNumber;
    }
}
