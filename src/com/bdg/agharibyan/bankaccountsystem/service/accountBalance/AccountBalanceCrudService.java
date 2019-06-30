package com.bdg.agharibyan.bankaccountsystem.service.accountBalance;

import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.AccountBalance;
import com.bdg.agharibyan.bankaccountsystem.storage.AccountBalanceStorage;
import com.bdg.agharibyan.bankaccountsystem.storage.Storage;

public class AccountBalanceCrudService implements AccountBalanceService{

    private final Storage accountBalanceStorage = new AccountBalanceStorage();
    @Override
    public AccountBalance create(double amount) {
        AccountBalance accountBalance = new AccountBalance(amount);

        if(accountBalanceStorage.add(accountBalance)){
            return accountBalance;
        }
        return null;
    }

    @Override
    public AccountBalance get(int id) {
        AbstractBankEntity accountBalance = accountBalanceStorage.get(id);

        return (AccountBalance) accountBalance;
    }

    @Override
    public AccountBalance delete(int id) {
        if(accountBalanceStorage.remove(id)){
            return this.get(id);
        }
        return null;
    }
}

