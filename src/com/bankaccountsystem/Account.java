package com.bankaccountsystem;

public class Account extends AbstractBankEntity {
    private Customer customer;
    private AccountBalance accountBalance;
    private AccountDetail accountDetail;

    public Account(int id, Customer customer, AccountBalance accountBalance, AccountDetail accountDetail) {
        super(id);
        this.customer = customer;
        this.accountBalance = accountBalance;
        this.accountDetail = accountDetail;
    }

    public Customer getCustomer() {
        return customer;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public AccountDetail getAccountDetail() {
        return accountDetail;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }


}
