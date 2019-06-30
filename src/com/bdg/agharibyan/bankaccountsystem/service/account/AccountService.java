package com.bdg.agharibyan.bankaccountsystem.service.account;

import com.bdg.agharibyan.bankaccountsystem.entity.Account;
import com.bdg.agharibyan.bankaccountsystem.entity.AccountBalance;
import com.bdg.agharibyan.bankaccountsystem.entity.AccountDetail;
import com.bdg.agharibyan.bankaccountsystem.entity.Customer;

public interface AccountService {

    Account create(Customer customer, AccountBalance accountBalance, AccountDetail accountDetail);

    Account get(int id);

    Account delete(int id);
}
