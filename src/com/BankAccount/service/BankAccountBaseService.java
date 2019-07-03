package com.BankAccount.service;

import com.BankAccount.entity.AbstractBankEntity;
import com.BankAccount.exception.BankAccountException;

public interface BankAccountBaseService<T extends AbstractBankEntity, R> {
    int STORAGE_SIZE = 10;

    T create(R requset);

    T get(int id) throws BankAccountException;

    T remove(int id) throws BankAccountException;

    T update(int id, R request) throws BankAccountException;


}
