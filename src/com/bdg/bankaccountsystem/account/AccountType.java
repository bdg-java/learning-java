package com.bdg.bankaccountsystem.account;

import com.bdg.bankaccountsystem.BankAccountSystemApplication;

public class AccountType extends BankAccountSystemApplication {
    private String deposit;
    private String credit;

    public AccountType(String deposit, String credit) {
        this.deposit = deposit;
        this.credit = credit;
    }
}
