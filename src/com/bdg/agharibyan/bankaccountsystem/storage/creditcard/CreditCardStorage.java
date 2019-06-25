package com.bdg.agharibyan.bankaccountsystem.storage.creditcard;

import com.bdg.agharibyan.bankaccountsystem.common.exception.CreditCardNotFoundException;
import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.CreditCard;
import com.bdg.agharibyan.bankaccountsystem.storage.Storage;

import java.time.LocalDate;

public final class CreditCardStorage implements Storage { // inchu e final?

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private CreditCard[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

    public CreditCardStorage(int storageSize){
        this.storageSize = storageSize;
        this.container = new CreditCard[this.storageSize];
        this.incSize = 1.5;
    }

    public CreditCardStorage(int storageSize, int incSize){
        this.storageSize = storageSize;
        this.container = new CreditCard[this.storageSize];
        this.incSize = incSize;
    }

    public CreditCardStorage(){
        this(DEFAULT_STORAGE_SIZE);
    }

    @Override
    public int storageSize(){
        return this.storageSize;
    }

    @Override
    public boolean add(AbstractBankEntity entity){ // chem haskanum entity- i tak inch e mtnum..
        if(this.storageSize == currentStorageIndex){
            incStorageSize();
        }
        entity.setId(currentStorageIndex+1);
        entity.setCreatedDate(LocalDate.now());

        this.container[currentStorageIndex] = (CreditCard) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove(int id){ //
        AbstractBankEntity removableCreditCard = this.get(id);

//       te petq e ciklov ifov gtnem nshvats idi objecty?

        CreditCard[] creditCardsAfterRemove = new CreditCard[currentStorageIndex-1];
        System.arraycopy(this.container, 0, creditCardsAfterRemove, 0, id-1);
        System.arraycopy(this.container, id, creditCardsAfterRemove, id-1, currentStorageIndex - id-1 - 1);

        return true;
    }

    @Override
    public AbstractBankEntity get(int id){
        if(id - 1 > this.currentStorageIndex){
            throw new CreditCardNotFoundException(id);
        }
        return this.container[id-1];
    }

    public void incStorageSize(){
        CreditCard[] cards = new CreditCard[currentStorageIndex + (int)(currentStorageIndex * incSize)];
        System.arraycopy(this.container, 0, cards, 0 , this.container.length);
        this.container = cards;
        this.storageSize = this.container.length;
    }
}
