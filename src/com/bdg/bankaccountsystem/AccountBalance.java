package com.bdg.bankaccountsystem;

public class AccountBalance implements CreditCardService  {
    private int balance;


    public AccountBalance(int balance)  {
        this.balance = balance;
    }

    public int getBalance()  {
        return balance;
    }

    public void setBalance(int balance)  {
        this.balance = balance;
    }

    @Override
    public CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType) {
        return null;
    }
}
