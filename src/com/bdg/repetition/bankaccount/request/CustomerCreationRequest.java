package com.bdg.repetition.bankaccount.request;

public class CustomerCreationRequest {

    private String firstName;
    private String lastName;
    private AddressCreationRequest addressCreationRequest;

    public CustomerCreationRequest(String firstName, String lastName, AddressCreationRequest addressCreationRequest){
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressCreationRequest = addressCreationRequest;
    }
}
