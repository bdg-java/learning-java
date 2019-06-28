package com.bdg.bankaccountsystem;

import java.time.LocalDate;

public class AbstractBankEntity {
    protected int id;
    protected LocalDate created;
    protected LocalDate deleted;
    protected LocalDate updated;

    public AbstractBankEntity() {
    }

    public AbstractBankEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCreated() {
        return this.created;
    }

    public void setCreated(LocalDate createdDate) {
        this.created = created;
    }

    public LocalDate getUpdated() {
        return this.updated;
    }

    public void setUpdated(LocalDate updatedDate) {
        this.updated = updated;
    }
}
