package com.BankAccount.dbo;

import com.BankAccount.entity.AccountBalance;
import com.BankAccount.entity.AccountDetail;

public class AccountRequest {
    public CustomerRequest customerRequest;
    public AccountDetail accountDetails;
    public AccountBalance accountBalance;

    public AccountRequest(CustomerRequest customerRequest, AccountDetail accountDetails, AccountBalance accountBalance) {
        this.customerRequest = customerRequest;
        this.accountDetails = accountDetails;
        this.accountBalance = accountBalance;
    }
}
