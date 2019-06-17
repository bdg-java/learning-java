package com.bankaccountsystem;

public abstract class AbstractBankEntity {
    protected int id;
    protected Date createdDate;
    protected Date updatedDate;

    public AbstractBankEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
