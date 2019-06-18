package com.bdg.bank;

public class Account extends AbstractBankEntity {
    private Customer customer;
    private AccountDetail accountDetail;
    private AccountBalance accountBalance;

    public Account(int id, Customer customer, AccountDetail accountDetail, AccountBalance accountBalance) {
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

    public void setAccountDetails(AccountDetail accountDetails) {
        this.accountDetail = accountDetail;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

}
