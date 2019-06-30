package com.bdg.agharibyan.bankaccountsystem.entity;

public final class AccountBalance extends AbstractBankEntity{ // petq e zharangi AbstractBankEntityic?
    private double amount;

    public AccountBalance(double amount){
        this.amount = amount;
    }

    public double getAccountBalance(){
        return amount;
    }

    public void setAccountBalance(double accountBalance){
        this.amount = accountBalance;
    }

    public String toString(){
        return "AccountBalance: " + amount;
    }
}
