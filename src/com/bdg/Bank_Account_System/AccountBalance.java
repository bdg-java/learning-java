package com.bdg.Bank_Account_System;

public class AccountBalance extends AbstractBankEntity {
    private double balance;

    private AccountBalance (int id,double balance){
        super(id);
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountBalance{" +
                "balance=" + balance +
                '}';
    }
}
