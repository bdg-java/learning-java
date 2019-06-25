package com.bdg.bankaccountsystem;

import java.util.Date;

public abstract class BankEntity {
    protected Date createDate;
    protected Date updateDate;
    protected Date deleted;

    public BankEntity() {
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
