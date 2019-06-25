package com.lesson11.storage;

import com.lesson11.entity.AbstractBankEntity;

public interface Storage {
    int storageSize();

    boolean add(AbstractBankEntity entity);

    boolean remove(int id);

    AbstractBankEntity get(int id);
}
