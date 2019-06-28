package com.bdg.bankaccountsystem.account;

import com.bdg.bankaccountsystem.AbstractBankEntity;

public class AccountBalance extends AbstractBankEntity {
    private int balance;

    public AccountBalance(int balance, int id) {
        super(id);
        this.balance = balance;
    }

}
