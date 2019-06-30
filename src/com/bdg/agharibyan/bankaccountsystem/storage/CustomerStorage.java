package com.bdg.agharibyan.bankaccountsystem.storage;

import com.bdg.agharibyan.bankaccountsystem.common.exception.CustomerNotFoundException;
import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.Customer;

import java.time.LocalDate;

public final class CustomerStorage implements Storage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Customer[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

    public CustomerStorage(int storageSize){
        this.storageSize = storageSize;
        this.container = new Customer[this.storageSize];
        this.incSize = 1.5;
    }

    public CustomerStorage(int storageSize, int incSize){
        this.storageSize = storageSize;
        this.container = new Customer[this.storageSize];
        this.incSize = incSize;
    }

    public CustomerStorage(){
        this(DEFAULT_STORAGE_SIZE);
    }

    @Override
    public int storageSize(){
        return this.storageSize;
    }

    @Override
    public boolean add(AbstractBankEntity entity){
        if(this.storageSize == currentStorageIndex){
            this.incStorageSize();
        }

        entity.setId(currentStorageIndex+1);
        entity.setCreatedDate(LocalDate.now());

        this.container[currentStorageIndex] = (Customer) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove (int id){
        Customer [] customersAfterRemove = new Customer[currentStorageIndex-1];
        System.arraycopy(this.container,0,customersAfterRemove,0,id-1);
        System.arraycopy(this.container,id,customersAfterRemove,id-1,currentStorageIndex - id-1 -1);
        currentStorageIndex--;
        this.container = customersAfterRemove;
        return true;
    }

    @Override
    public AbstractBankEntity get(int id){
        if(id - 1 > this.currentStorageIndex){
            throw new CustomerNotFoundException(id);
        }
        return this.container[id-1];
    }

    public void incStorageSize(){
        Customer[]customers = new Customer[currentStorageIndex + (int)(currentStorageIndex * incSize)];
        System.arraycopy(this.container, 0, customers, 0, this.container.length);
        this.container = customers;
        this.storageSize = this.container.length;
    }
}
