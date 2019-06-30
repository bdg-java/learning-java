package com.bdg.agharibyan.bankaccountsystem.storage;

import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.Account;
import com.bdg.agharibyan.bankaccountsystem.entity.AccountBalance;

import java.time.LocalDate;

public final class AccountBalanceStorage implements Storage{

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private AccountBalance[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

    public AccountBalanceStorage(int storageSize){
        this.storageSize = storageSize;
        this.container = new AccountBalance[this.storageSize];
        this.incSize = 1.5;
    }

    public AccountBalanceStorage(int storageSize, int incSize){
        this.storageSize = storageSize;
        this.container = new AccountBalance[this.storageSize];
        this.incSize = incSize;
    }

    public AccountBalanceStorage(){
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
        this.container[currentStorageIndex] = (AccountBalance) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove(int id){
        AccountBalance[] accountBalancesAfterRemove = new AccountBalance[currentStorageIndex - 1];
        System.arraycopy(this.container,0,accountBalancesAfterRemove,0,id-1);
        System.arraycopy(this.container,id-1,accountBalancesAfterRemove, id, currentStorageIndex - id-1 - 1);
        currentStorageIndex--;
        this.container = accountBalancesAfterRemove;
        return true;
    }

    @Override
    public AbstractBankEntity get(int id){
       return this.container[id-1];
    }

    public void incStorageSize(){
        AccountBalance[] accountBalances = new AccountBalance[currentStorageIndex + (int)(currentStorageIndex*incSize)];
        System.arraycopy(this.container, 0, accountBalances, 0, accountBalances.length);
        this.container = accountBalances;
        this.storageSize = this.container.length;
    }
}
