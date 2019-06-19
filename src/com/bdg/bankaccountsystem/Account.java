package com.bdg.bankaccountsystem;

public class Account extends AbstractBankEntity {
    private Customer customer;
    private AccountDetail accountDetail;
    private AccountBalance accountBalance;

    public Account(Customer customer, AccountBalance accountBalance, AccountDetail accountDetail, int id) {
        super(id);
        this.customer = customer;
        this.accountBalance = accountBalance;
        this.accountDetail = accountDetail;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountBalance getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountDetail getAccountDetail() {
        return this.accountDetail;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }
}
