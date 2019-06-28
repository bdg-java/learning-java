package com.bdg.agharibyan.bankaccountsystem.entity;

public final class AccountBalance extends AbstractBankEntity{ // petq e zharangi AbstractBankEntityic?
    private double accountBalance;

    private AccountBalance(int accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance)
    {
        this.accountBalance = accountBalance;
    }


}
