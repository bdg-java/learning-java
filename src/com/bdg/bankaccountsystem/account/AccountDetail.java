package com.bdg.bankaccountsystem.account;

import com.bdg.bankaccountsystem.AbstractBankEntity;

public class AccountDetail extends AbstractBankEntity {

    private AccountType accountType;

    public AccountDetail(AccountType accountType, int id) {
        super(id);
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
