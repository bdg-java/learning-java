package com.bdg.agharibyan.bankaccountsystem.storage;

import com.bdg.agharibyan.bankaccountsystem.common.exception.AccountDetailNotFoundException;
import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.AccountBalance;
import com.bdg.agharibyan.bankaccountsystem.entity.AccountDetail;

import java.time.LocalDate;

public final class AccountDetailStorage implements Storage{

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private AccountDetail[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

    public AccountDetailStorage(int storageSize){
        this.storageSize = storageSize;
        this.container = new AccountDetail[this.storageSize];
        this.incSize = 1.5;
    }

    public AccountDetailStorage(int storageSize, int incSize){
        this.storageSize = storageSize;
        this.container = new AccountDetail[this.storageSize];
        this.incSize = incSize;
    }

    public AccountDetailStorage(){
        this(DEFAULT_STORAGE_SIZE);
    }

    @Override
    public int storageSize() {
        return this.storageSize;
    }

    @Override
    public boolean add(AbstractBankEntity entity) {
        if(this.currentStorageIndex == storageSize){
            this.incStorageSize();
        }
        entity.setId(currentStorageIndex+1);
        entity.setCreatedDate(LocalDate.now());

        this.container[currentStorageIndex] = (AccountDetail) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove(int id) {

        AccountDetail[] accountDetailsAfterRemove = new AccountDetail[currentStorageIndex - 1];
        System.arraycopy(this.container, 0, accountDetailsAfterRemove, 0, id-1);
        System.arraycopy(this.container, id, accountDetailsAfterRemove, id-1, currentStorageIndex - id-1 - 1);
        currentStorageIndex--;
        this.container = accountDetailsAfterRemove;

        return true;
    }

    @Override
    public AbstractBankEntity get(int id) {
        if(id-1 > this.currentStorageIndex){
            throw new AccountDetailNotFoundException(id);
        }
        return this.container[id-1];
    }

    public void incStorageSize(){
        AccountDetail[] accountDetails = new AccountDetail[currentStorageIndex + (int)(currentStorageIndex + currentStorageIndex*incSize)];
        System.arraycopy(this.container, 0, accountDetails, 0, this.container.length);
        this.container = accountDetails;
        this.storageSize = this.container.length;
    }
}
