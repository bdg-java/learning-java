package com.bankaccountsystem;

import java.util.Date;

public abstract class AbstractBankEntity {
    private int id;
    private Date createdDate;
    private Date updatedDate;

    AbstractBankEntity(int id) {
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
