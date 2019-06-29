package com.bdg.agharibyan.bankaccountsystem.storage;

import com.bdg.agharibyan.bankaccountsystem.entity.Address;

public final class AddressStorage extends Storage{
    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Address[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageSize = 0;

    public AddressStorage(int storageSize){
        this.storageSize = storageSize;
        this.container = new Address[this.storageSize];
        this.incSize = 1.5;
    }

    public AddressStorage(int storageSize, int incSize){
        this.storageSize = storageSize;
        this.container = new Address[this.storageSize];
        this.incSize = incSize;
    }

    public AddressStorage(){
        this(DEFAULT_STORAGE_SIZE);
    }
}
