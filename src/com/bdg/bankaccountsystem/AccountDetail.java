package com.bdg.bankaccountsystem;

public class AccountDetail {
    private String currency;

    AccountDetail(String currency) {
        this.currency = currency;

    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String toString(){
        return "--AccountDetail class--- , currency:" + currency;
    }
}
