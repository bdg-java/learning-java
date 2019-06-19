package com.bdg.bankaccountsystem;

public class AccountType extends BankAccountSystemApplication{
    private String deposit;
    private String credit;

    public AccountType(String deposit, String credit) {
        this.deposit = deposit;
        this.credit = credit;
    }
}
