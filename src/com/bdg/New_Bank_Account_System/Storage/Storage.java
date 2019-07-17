package com.bdg.New_Bank_Account_System.Storage;

import com.bdg.New_Bank_Account_System.Entity.AbstractBankEntity;



public interface Storage {

    int storageSize();

    boolean add(AbstractBankEntity entity);

    boolean remove(int id);

    AbstractBankEntity get(int id);

}
