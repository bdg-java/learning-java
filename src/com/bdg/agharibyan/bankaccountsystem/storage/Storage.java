package com.bdg.agharibyan.bankaccountsystem.storage;

import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;

public interface Storage {

    int storageSize();

    boolean add(AbstractBankEntity entity);

    boolean remove(int id);

    AbstractBankEntity get(int id);

}
