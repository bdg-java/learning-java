package com.BankAccount.storage;

import com.BankAccount.entity.AbstractBankEntity;

public interface Storage<T extends AbstractBankEntity> {
    int storageSize();

    T add(T entity);

    T remove(int id);

    T get(int id);
}
