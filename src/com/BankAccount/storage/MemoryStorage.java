package com.BankAccount.storage;

import com.BankAccount.entity.AbstractBankEntity;
import com.BankAccount.exception.AbstractBankEntityObjectNotFound;

import java.time.LocalDate;

public class MemoryStorage<T extends AbstractBankEntity> implements Storage<T> {
    private int currentIndex;
    private AbstractBankEntity[] container;
    private int storageSize;

    public MemoryStorage(int storageSize) {
        this.container = new AbstractBankEntity[storageSize];
    }

    @Override
    public int storageSize() {
        return this.storageSize;
    }

    @Override
    public T add(T entity) {
        if (this.currentIndex == container.length) {
            updateSize();
        }
        entity.setId(currentIndex + 1);
        entity.setCreditDate(LocalDate.now());
        this.container[currentIndex++] = entity;
        return entity;
    }

    private void updateSize() {
        AbstractBankEntity[] tmp = new AbstractBankEntity[this.container.length + this.container.length / 2];
        System.arraycopy(this.container, 0, tmp, 0, this.container.length);
        this.container = tmp;
    }

    @Override
    public T remove(int id) {
        T found = get(id);
        if (found != null) {
            found.setDeleteDate(LocalDate.now());
            return found;
        }
        throw new AbstractBankEntityObjectNotFound(id);
    }

    @Override
    public T get(int id) {
        if (id - 1 > this.currentIndex) {
            throw new AbstractBankEntityObjectNotFound(id);
        }
        return (T) this.container[id - 1];
    }
}
