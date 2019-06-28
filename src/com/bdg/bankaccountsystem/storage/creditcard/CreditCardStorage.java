package com.bdg.bankaccountsystem.storage.creditcard;

import com.bdg.bankaccountsystem.AbstractBankEntity;
import com.bdg.bankaccountsystem.CreditCard;
import com.bdg.bankaccountsystem.storage.Storage;

import java.time.LocalDate;

public class CreditCardStorage implements Storage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private CreditCard[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

    public CreditCardStorage (int storageSize) {
        this.storageSize = storageSize;
        this.container = new CreditCard[this.storageSize];
        this.incSize = 1.5;
    }

    public CreditCardStorage(int storageSize, int incSize) {
        this.incSize = incSize;
        this.storageSize = storageSize;
        this.container = new CreditCard[this.storageSize];
    }

    public CreditCardStorage() {
        this(DEFAULT_STORAGE_SIZE);
    }

    @Override
    public int storageSize() {
        return this.storageSize;
    }

    @Override
    public boolean add(AbstractBankEntity entity) {
        if (this.storageSize == currentStorageIndex) {
            incStorageSize();
        }
        entity.setId(currentStorageIndex + 1);
        entity.setCreated(LocalDate.now());

        this.container[currentStorageIndex] = (CreditCard) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove(int id) {
//        CreditCard[] newcontainer = new CreditCard[storageSize];
//        this.container[i] = this.container[storageSize-1];

        return false;
    }

    @Override
    public AbstractBankEntity get(int id) {
        return null;
    }
    public void incStorageSize(){
        CreditCard[] cards = new CreditCard[currentStorageIndex + (int) (currentStorageIndex * incSize)];
        System.arraycopy(this.container, 0, cards, 0, this.container.length);
        this.container = cards;
        this.storageSize = this.container.length;
    };
}
