package com.bdg.bank;

import java.util.Date;

public abstract class AbstractBankEntity {
    protected int id;
    protected Date createdDate;
    protected Date updatedDate;

    public AbstractBankEntity(int id) {
        this.id = id;
    }

    public Date getCreatedDateDate() {
        return this.createdDate;
    }

    public Date getUpdateDate() {
        return this.updatedDate;
    }

    public int getId() {
        return this.id;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setId(int id) {
        this.id = id;
    }



}
