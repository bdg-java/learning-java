package com.BankAccount.entity;

public class Account extends AbstractBankEntity {
    private Customer customer;
    private AccountDetail accountDetails;
    private AccountBalance accountBalance;

    public Account(Customer customer, AccountDetail accountDetails, AccountBalance accountBalance) {
        this.customer = customer;
        this.accountDetails = accountDetails;
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountDetail getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetail accountDetails) {
        this.accountDetails = accountDetails;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }
}
