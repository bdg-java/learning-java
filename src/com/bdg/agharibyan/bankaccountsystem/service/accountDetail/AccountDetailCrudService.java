package com.bdg.agharibyan.bankaccountsystem.service.accountDetail;

import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.AccountDetail;
import com.bdg.agharibyan.bankaccountsystem.entity.CreditCard;
import com.bdg.agharibyan.bankaccountsystem.storage.AccountBalanceStorage;
import com.bdg.agharibyan.bankaccountsystem.storage.AccountDetailStorage;
import com.bdg.agharibyan.bankaccountsystem.storage.Storage;

public class AccountDetailCrudService implements AccountDetailService {

    private final Storage accountDetailStorage = new AccountDetailStorage();

    @Override
    public AccountDetail create(int accountNumber, CreditCard creditCard) {
        final AccountDetail accountDetail = new AccountDetail(accountNumber, creditCard);
        if(accountDetailStorage.add(accountDetail)){
            return accountDetail;
        }
        return null;
    }

    @Override
    public AccountDetail get(int id) {
        AbstractBankEntity accountDetail = accountDetailStorage.get(id);

        return (AccountDetail) accountDetail;
    }

    @Override
    public AccountDetail delete(int id) {
        if(accountDetailStorage.remove(id)){
            return this.get(id);
        }
        return null;
    }
}
