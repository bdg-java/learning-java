package com.bdg.repetition.bankaccount.request;

public class AccountCreationRequest {

    private CustomerCreationRequest customerCreationRequest;
    private CreditCardCreationRequest creditCardCreationRequest;
    private AccountBalanceCreationRequest accountBalanceCreationRequest;

    public AccountCreationRequest(CustomerCreationRequest customerCreationRequest,CreditCardCreationRequest creditCardCreationRequest, AccountBalanceCreationRequest accountBalanceCreationRequest){
        this.customerCreationRequest = customerCreationRequest;
        this.creditCardCreationRequest = creditCardCreationRequest;
        this.accountBalanceCreationRequest = accountBalanceCreationRequest;
    }
}
