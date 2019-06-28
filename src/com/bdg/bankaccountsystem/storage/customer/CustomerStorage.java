package com.bdg.bankaccountsystem.storage.customer;

import com.bdg.bankaccountsystem.AbstractBankEntity;
import com.bdg.bankaccountsystem.Customer;
import com.bdg.bankaccountsystem.exceptions.CustomerNotFoundException;
import com.bdg.bankaccountsystem.storage.Storage;

import java.time.LocalDate;

public class CustomerStorage implements Storage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Customer[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

    public CustomerStorage(int storageSize) {
        this.storageSize = storageSize;
        this.container = new Customer[this.storageSize];
        this.incSize = 1.5;
    }

    public CustomerStorage(int storageSize, double incSize) {
        this.incSize = incSize;
        this.storageSize = storageSize;
        this.container = new Customer[this.storageSize];
    }

    public CustomerStorage() {
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
        entity.setId(currentStorageIndex+1);
        entity.setCreated(LocalDate.now());

        this.container[currentStorageIndex] = (Customer) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove(int id) {
        Customer[] newcontainer = new Customer[container.length-1];
         for (int i = 0;i<container.length;i++) {
          if(this.container[i] != null && id == this.container[i].getId()) {
              this.container[i] = null;
          }
      } newcontainer = container;
        return true;
    }

    @Override
    public AbstractBankEntity get(int id) {
        if(id-1 > currentStorageIndex) {
            throw new CustomerNotFoundException(id);
        }
        return this.container[id - 1];
    }

    public void incStorageSize() {
        Customer[] customers = new Customer[currentStorageIndex + (int) (currentStorageIndex * incSize)];
        System.arraycopy(this.container, 0, customers, 0, this.container.length);
        this.container = customers;
        this.storageSize = this.container.length;
    }


}
