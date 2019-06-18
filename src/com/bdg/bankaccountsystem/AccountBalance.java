package com.bdg.bankaccountsystem;

public class AccountBalance {

    private int balance;
    AccountBalance(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString(){
        return "--AccountBalance class--- , balance:" + balance;
    }
}
