package com.bdg.bankaccountsystem.storage.customer;

import com.bdg.bankaccountsystem.AbstractBankEntity;
import com.bdg.bankaccountsystem.storage.Storage;

public class CustomerStorage implements Storage {
    @Override
    public int storageSize() {
        return 0;
    }

    @Override
    public boolean add(AbstractBankEntity entity) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public AbstractBankEntity get(int id) {
        return null;
    }
}
