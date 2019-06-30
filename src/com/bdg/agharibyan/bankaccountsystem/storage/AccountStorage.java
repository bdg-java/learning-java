package com.bdg.agharibyan.bankaccountsystem.storage;

import com.bdg.agharibyan.bankaccountsystem.common.exception.AccountNotFoundException;
import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.Account;

import java.time.LocalDate;

public final class AccountStorage implements Storage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Account[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

    public AccountStorage(int storageSize){
        this.storageSize = storageSize;
        this.container = new Account[this.storageSize];
        this.incSize = 1.5;
    }

    public AccountStorage(int storageSize, int incSize){
        this.storageSize = storageSize;
        this.container = new Account[this.storageSize];
        this.incSize = incSize;
    }

    public AccountStorage(){
        this(DEFAULT_STORAGE_SIZE);
    }

    @Override
    public int storageSize(){
        return storageSize;
    }

    @Override
    public boolean add(AbstractBankEntity entity) {
        if(this.storageSize == currentStorageIndex){
            this.incStorageSize();
        }
        entity.setId(currentStorageIndex+1);
        entity.setCreatedDate(LocalDate.now());

        this.container[currentStorageIndex] = (Account) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove(int id) {
        Account[] accountsAfterRemove = new Account[currentStorageIndex-1];
        System.arraycopy(this.container, 0, accountsAfterRemove, 0, id-1);
        System.arraycopy(this.container, id, accountsAfterRemove, id-1, currentStorageIndex - id-1 - 1);
        currentStorageIndex--;
        this.container = accountsAfterRemove;
        return true;
    }

    @Override
    public AbstractBankEntity get(int id) {
        if(id-1 > currentStorageIndex){
            throw new AccountNotFoundException(id);
        }
        return this.container[id-1];
    }

    public void incStorageSize(){
        Account[]accounts = new Account[currentStorageIndex + (int) (currentStorageIndex + currentStorageIndex * incSize)];
        System.arraycopy(this.container,0,accounts,0,this.container.length);
        this.container = accounts;
        this.storageSize = this.container.length;
    }
}
