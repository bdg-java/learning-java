package com.BankAccount.entity;

public class AccountBalance extends AbstractBankEntity {
    private double balance;

    public AccountBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
