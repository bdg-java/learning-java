package com.bdg.repetition.bankaccount.request;

public class AddressCreationRequest {

    private String countryName;
    private String cityName;
    private String street;
    private int homeNumber;
    private String phoneNumber;

    public AddressCreationRequest(String countryName, String cityName, String street, int homeNumber, String phoneNumber){
        this.countryName = countryName;
        this.cityName = cityName;
        this.street = street;
        this.homeNumber = homeNumber;
        this.phoneNumber = phoneNumber;
    }
}
