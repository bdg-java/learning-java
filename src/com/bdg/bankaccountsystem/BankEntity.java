package com.bdg.bankaccountsystem;

import java.util.Date;

public abstract class BankEntity {
    protected int id;
    protected Date createDate;
    protected Date updateDate;

    public BankEntity() {
    }

    public  BankEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
