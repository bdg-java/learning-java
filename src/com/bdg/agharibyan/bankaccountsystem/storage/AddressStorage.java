package com.bdg.agharibyan.bankaccountsystem.storage;

import com.bdg.agharibyan.bankaccountsystem.common.exception.AddressNotFoundException;
import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.Address;

import java.time.LocalDate;

public final class AddressStorage implements Storage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Address[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

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

    @Override
    public int storageSize(){
        return this.storageSize;
    }

    @Override
    public boolean add(AbstractBankEntity entity) {
        if(this.storageSize == currentStorageIndex){
            this.incStorageSize();
        }
        entity.setId(currentStorageIndex+1);
        entity.setCreatedDate(LocalDate.now());
        this.container[currentStorageIndex] = (Address) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove(int id){
        Address[] addressesAfterRemove = new Address[this.currentStorageIndex-1];
        System.arraycopy(this.container, 0, addressesAfterRemove, 0, id-1);
        System.arraycopy(this.container,id,addressesAfterRemove,id-1,currentStorageIndex-id-1-1);
        currentStorageIndex--;
        this.container = addressesAfterRemove;
        return true;
    }

    @Override
    public AbstractBankEntity get(int id){
        if(id - 1 > this.currentStorageIndex){
            throw new AddressNotFoundException(id);
        }
        return this.container[id-1];
    }

    public void incStorageSize(){
        Address [] addresses = new Address[currentStorageIndex + (int)(currentStorageIndex*incSize)];
        System.arraycopy(this.container, 0, addresses, 0, addresses.length);
        this.container = addresses;
        this.storageSize = this.container.length;
    }
}
