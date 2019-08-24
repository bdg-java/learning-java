package com.bdg.repetition.bankaccount.bankaccountservice.entity;


public class Customer extends AbstractBankEntity {

    private String firstName;
    private String lastName;
    private Address address;

    public Customer(String firstName, String lastName, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

}
