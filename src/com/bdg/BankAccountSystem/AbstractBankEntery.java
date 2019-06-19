package com.bdg.BankAccountSystem;

import java.util.Date;

public class AbstractBankEntery
{
    protected int id;
    protected Date createDate;
    protected Date updateDate;

    public AbstractBankEntery(int id){
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }
}
