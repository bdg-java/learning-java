package com.bdg.bankaccountsystem.storage;

import com.bdg.bankaccountsystem.AbstractBankEntity;

public interface Storage {

    int storageSize();

    boolean add(AbstractBankEntity entity);

    boolean remove(int id);

    AbstractBankEntity get(int id);
}
