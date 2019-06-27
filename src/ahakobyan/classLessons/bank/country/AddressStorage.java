package ahakobyan.classLessons.bank.country;

import ahakobyan.classLessons.bank.bankSystem.AbstractBankEntity;
import ahakobyan.classLessons.bank.bankSystem.Storage;

import java.time.LocalDate;

public class AddressStorage implements Storage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Address[] container;
    private int storageSize;
    private final int incSize;
    private int currentStorageIndex = 0;

    public AddressStorage(int storageSize) {
        this.storageSize = storageSize;
        this.container = new Address[this.storageSize];
        this.incSize = 2;
    }

    public AddressStorage(int storageSize, int incSize) {
        this.incSize = incSize;
        this.storageSize = storageSize;
        this.container = new Address[this.storageSize];

    }

    public AddressStorage() {
        this(DEFAULT_STORAGE_SIZE);
    }

    @Override
    public int storageSize() {
        return this.storageSize;

    }

    @Override
    public boolean add(AbstractBankEntity entity) {
        if(this.storageSize == currentStorageIndex) {
            storageSize();
        }
        entity.setId(currentStorageIndex +1);
        entity.setCreatedDate(LocalDate.now());

        this.container[currentStorageIndex] = (Address) entity;
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
            throw new AddressNotFoundException();
        }
        return this.container[id - 1];
    }

    public void incStorageSize() {
        Address[] addresses = new Address[currentStorageIndex + (int)currentStorageIndex * incSize];
        System.arraycopy(this.container, 0,addresses,0, this.container.length);
        this.container = addresses;
        this.storageSize = this.container.length;
    }
}
