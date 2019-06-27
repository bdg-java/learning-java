package com.bdg.bankaccountsystem;

public class CardBalance extends CreditCardServiceImpl implements  Transactions {
    private int balance ;

    public CardBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void cashIn(int amount) {

    }

    @Override
    public void cashOut(int amount) {

    }

    @Override
    public void moneyOrder(String account) {

    }

    @Override
    public void bankInterest() {

    }

    @Override
    public void cardBalance() {

    }
}
