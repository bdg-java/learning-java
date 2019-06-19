package com.bdg.bankaccountsystem;

public class AccountBalance extends AbstractBankEntity {
    private int balance;

    public AccountBalance(int balance, int id) {
        super(id);
        this.balance = balance;
    }

}
