package com.bdg.agharibyan.bankaccountsystem.entity;

public final class Account extends AbstractBankEntity {
    private Customer customer;
    private AccountDetail accountDetail;
    private AccountBalance accountBalance;

    public Account(Customer customer, AccountBalance accountBalance, AccountDetail accountDetail){
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

    public void setAccountBalance(AccountBalance accountBalance){
        this.accountBalance = accountBalance;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }

    public String toString(){
        return "Account: {" +
                "Customer: '" + customer + '\'' +
                "AccountDetail: " + accountDetail +
                "AccountBalance: " + accountBalance +
                "}";
    }
}
