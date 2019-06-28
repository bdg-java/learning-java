package com.lesson11.storage;

import com.lesson11.entity.AbstractBankEntity;
import com.lesson11.entity.Address;
import com.lesson11.exception.AddressNotFound;

import java.time.LocalDate;
import java.util.Arrays;


public final class AddressStorage implements Storage {
    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Address[] container;
    private int storageSize;
    private final int incSize;
    private int currentStorageIndex;

    public AddressStorage(int storageSize) {
        this.storageSize = storageSize;
        this.container = new Address[storageSize];
        this.incSize = 2;
    }

    public AddressStorage() {
        this(DEFAULT_STORAGE_SIZE);
    }

    @Override
    public int storageSize() {
        return this.storageSize;
    }

    @Override
    public boolean add(AbstractBankEntity entity) {
        if (currentStorageIndex == storageSize)
            incStorageSize();
        entity.setId(currentStorageIndex + 1);
        entity.setCreditDate(LocalDate.now());
        this.container[currentStorageIndex] = (Address) entity;
        currentStorageIndex++;
        return true;
    }

    private void incStorageSize() {
        Address[] address = new Address[currentStorageIndex + currentStorageIndex * incSize];
        System.arraycopy(this.container, 0, address, 0, this.container.length);
        this.container = address;
        storageSize = this.container.length;
    }

    @Override
    public boolean remove(int id) {
        Address address = (Address) get(id);
        if (address != null) {
            address.setDeleteDate(LocalDate.now());
            return true;
        }
        return false;
    }


    @Override
    public AbstractBankEntity get(int id) {
        if (id - 1 > currentStorageIndex) {
            throw new AddressNotFound(id);
        }
        return this.container[id - 1];
    }
}
