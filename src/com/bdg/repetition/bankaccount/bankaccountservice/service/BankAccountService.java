package com.bdg.repetition.bankaccount.bankaccountservice.service;

import com.bdg.repetition.bankaccount.bankaccountservice.entity.AbstractBankEntity;

public interface BankAccountService<T extends AbstractBankEntity, R> {

    int STORAGE_SIZE = 10;

    T create(R request);

    T get(int id);

    T delete(int id);

}
