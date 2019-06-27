package ahakobyan.classLessons.bank.account;

import ahakobyan.classLessons.bank.bankSystem.AbstractBankEntity;
import ahakobyan.classLessons.bank.bankSystem.Storage;

import java.time.LocalDate;

public class AccountStorage implements Storage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Account[] container;
    private int storageSize;
    private final int incSize;
    private int currentStorageIndex = 0;

    public AccountStorage(int storageSize) {
        this.storageSize = storageSize;
        this.container = new Account[this.storageSize];
        this.incSize = 2;
    }

    public AccountStorage(int storageSize, int incSize) {
        this.incSize = incSize;
        this.storageSize = storageSize;
        this.container = new Account[this.storageSize];

    }

    public AccountStorage() {
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

        this.container[currentStorageIndex] = (Account) entity;
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
            throw new AccountNotFoundException();
        }
        return this.container[id - 1];
    }

    public void incStorageSize() {
        Account[] accounts = new Account[currentStorageIndex + (int)currentStorageIndex * incSize];
        System.arraycopy(this.container, 0,accounts,0, this.container.length);
        this.container = accounts;
        this.storageSize = this.container.length;
    }
}

