package com.bdg.agharibyan.bankaccountsystem.service.account;

import com.bdg.agharibyan.bankaccountsystem.common.exception.AccountNotFoundException;
import com.bdg.agharibyan.bankaccountsystem.entity.*;
import com.bdg.agharibyan.bankaccountsystem.storage.AccountStorage;
import com.bdg.agharibyan.bankaccountsystem.storage.Storage;

public class AccountCrudService implements AccountService{

    private final Storage accountStorage = new AccountStorage();

    @Override
    public Account create(Customer customer, AccountBalance accountBalance, AccountDetail accountDetail) {
        final Account account = new Account(customer, accountBalance, accountDetail);

        if(accountStorage.add(account)){
            return account;
        }

        return null;
    }

    @Override
    public Account get(int id) {
        AbstractBankEntity account = accountStorage.get(id);

        if(account == null){
            throw new AccountNotFoundException(id);
        }
        return (Account) account;
    }

    @Override
    public Account delete(int id) {
        if(accountStorage.remove(id)){
            return this.get(id);
        }
        return null;
    }
}
