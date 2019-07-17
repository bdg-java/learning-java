package com.bdg.New_Bank_Account_System.Entity;

import java.time.LocalDate;


public abstract class AbstractBankEntity {


    protected int id;
    protected LocalDate created;
    protected LocalDate updated;
    protected LocalDate deleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    public LocalDate getDeleted() {
        return deleted;
    }

    public void setDeleted(LocalDate deleted) {
        this.deleted = deleted;
    }
}