package com.bdg.repetition.bankaccount.bankaccountservice.entity;

public class Account extends AbstractBankEntity {

    private Customer customer;
    private CreditCard creditCard;
    private double accountBalance;   // inchu estegh grem double-ov, ayl voch te AccountBalance type-ov?

    public Account(Customer customer, CreditCard creditCard, double accountBalance){
        this.customer = customer;
        this.creditCard = creditCard;
        this.accountBalance = accountBalance;
    }

}
