package ahakobyan.classLessons.bank.Customer;

import ahakobyan.classLessons.bank.bankSystem.AbstractBankEntity;
import ahakobyan.classLessons.bank.bankSystem.Storage;

import java.time.LocalDate;

public class CustomerStroage implements Storage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Customer[] container;
    private int storageSize;
    private final int incSize;
    private int currentStorageIndex = 0;


    public CustomerStroage(int storageSize) {
        this.storageSize = storageSize;
        this.container = new Customer[this.storageSize];
        this.incSize = 2;
    }

    public CustomerStroage(int storageSize, int incSize) {
        this.incSize = incSize;
        this.storageSize = storageSize;
        this.container = new Customer[this.storageSize];
    }

    public CustomerStroage() {
        this(DEFAULT_STORAGE_SIZE);
    }

    @Override
    public int storageSize() {
        return this.storageSize;
    }

    @Override
    public boolean add(AbstractBankEntity entity) {
        if (this.storageSize == currentStorageIndex) {
            storageSize();
        }

        entity.setId(currentStorageIndex +1);
        entity.setCreatedDate(LocalDate.now());

        this.container[currentStorageIndex] = (Customer) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public AbstractBankEntity get(int id) {
        if (id - 1 > currentStorageIndex) {
            throw new CustomerNotFoundException();
        }
        return this.container[id -1];
    }

    public void incStorageSize() {
        Customer[] customers = new Customer[currentStorageIndex + (int) currentStorageIndex * incSize];
        System.arraycopy(this.container,0, customers,0, this.container.length);
        this.container = customers;
        this.storageSize = this.container.length;
    }
}
