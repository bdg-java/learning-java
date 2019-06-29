package com.bdg.agharibyan.bankaccountsystem.storage;

import com.bdg.agharibyan.bankaccountsystem.common.exception.PhoneNumberNotFoundException;
import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.PhoneNumber;

import java.time.LocalDate;

public class PhoneNumberStorage implements Storage{

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private PhoneNumber[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

    public PhoneNumberStorage(int storageSize){
        this.storageSize = storageSize;
        this.container = new PhoneNumber[this.storageSize];
        this.incSize = 1.5;
    }

    public PhoneNumberStorage(int storageSize, double incSize){
        this.storageSize = storageSize;
        this.incSize = incSize;
        this.container = new PhoneNumber[this.storageSize];
    }

    public PhoneNumberStorage(){
        this(DEFAULT_STORAGE_SIZE);
    }

    @Override
    public int storageSize(){
        return this.storageSize;
    }

    @Override
    public boolean add(AbstractBankEntity entity){
        if (this.storageSize == currentStorageIndex){
            this.incStorageSize();
        }
        entity.setId(currentStorageIndex+1);
        entity.setCreatedDate(LocalDate.now());

        this.container[currentStorageIndex] = (PhoneNumber) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove (int id){
        PhoneNumber[] phoneNumbersAfterRemove = new PhoneNumber[currentStorageIndex-1];
        System.arraycopy(this.container,0,phoneNumbersAfterRemove,0, id-1);
        System.arraycopy(this.container,id,phoneNumbersAfterRemove,id-1, currentStorageIndex-id-1-1);
        currentStorageIndex--;
        this.container = phoneNumbersAfterRemove;
        return true;
    }

    @Override
    public AbstractBankEntity get(int id){
        if(id-1 > this.currentStorageIndex){
            throw new PhoneNumberNotFoundException(id);
        }
        return this.container[id-1];
    }

    public void incStorageSize(){
        PhoneNumber [] phoneNumbers = new PhoneNumber[currentStorageIndex + (int)(currentStorageIndex*incSize)];
        System.arraycopy(this.container, 0, phoneNumbers, 0, currentStorageIndex);
        this.container = phoneNumbers;
        this.storageSize = this.container.length;
    }
}
