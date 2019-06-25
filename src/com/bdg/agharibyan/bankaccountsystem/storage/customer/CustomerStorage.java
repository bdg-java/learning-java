package com.bdg.agharibyan.bankaccountsystem.storage.customer;

import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.Customer;
import com.bdg.agharibyan.bankaccountsystem.storage.Storage;

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
        return storageSize;
    }

    @Override
    public boolean add(AbstractBankEntity entity){
        if(this.storageSize == currentStorageIndex){
            this.incStorageSize();
        }

        //es chem haskanum inchu e Storage interfaceum fieldy AbstractBankEntity type-i
        //chem haskanum inchpes em get anum customerin unenalov entityn

        return false;
    }

    @Override
    public boolean remove (int id){
        return false;
    }

    @Override
    public AbstractBankEntity get(int id){
        return null;
    }

    public void incStorageSize(){
        Customer[]customers = new Customer[currentStorageIndex + (int)(currentStorageIndex * incSize)];
        System.arraycopy(this.container, 0, customers, 0, this.container.length);
        this.container = customers;
        this.storageSize = this.container.length;
    }
}
