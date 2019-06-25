package com.bdg.agharibyan.bankaccountsystem.entity;

public class AccountBalance {
    private int accountBalance;

    private AccountBalance(int accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance)
    {
        this.accountBalance = accountBalance;
    }


}
