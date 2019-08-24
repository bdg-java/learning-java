package com.bdg.repetition.bankaccount.bankaccountservice.request;

public class AccountCreationRequest {

    public CustomerCreationRequest customerCreationRequest;
    public CreditCardCreationRequest creditCardCreationRequest;
    public AccountBalanceCreationRequest accountBalanceCreationRequest;

    public AccountCreationRequest(CustomerCreationRequest customerCreationRequest,CreditCardCreationRequest creditCardCreationRequest, AccountBalanceCreationRequest accountBalanceCreationRequest){
        this.customerCreationRequest = customerCreationRequest;
        this.creditCardCreationRequest = creditCardCreationRequest;
        this.accountBalanceCreationRequest = accountBalanceCreationRequest;
    }
}
