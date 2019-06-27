package com.bdg.BankAccountCreditCard.Storage;

import com.bdg.BankAccountCreditCard.entity.AbstractBankEntery;

public interface Storage {

    int storageSize();
    boolean add(AbstractBankEntery entity);
    boolean remove (int id);


    AbstractBankEntery get( int id);

}