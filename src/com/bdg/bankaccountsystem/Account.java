package com.bdg.bankaccountsystem;

public class Account extends abstractBankEntity {

    private Customer customer;
    private AccountDetail accountDetail;
    private AccountBalance accountBalance;

    Account(Customer customer, AccountBalance accountBalance, AccountDetail accountDetail,int id) {
        super(id);
        this.customer = customer;
        this.accountDetail = accountDetail;
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountDetail getAccountDetail() {
        return accountDetail;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }
}
