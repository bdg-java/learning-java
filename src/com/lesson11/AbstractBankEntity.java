package com.lesson11;

import java.util.Date;

public abstract class AbstractBankEntity {
    protected int id;
    protected Date creditDate;
    protected Date updateDate;


    public AbstractBankEntity(int id) {
        this.id = id;
    }

    public Date getCreditDate() {
        return this.creditDate;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }

    public int getId() {
        return this.id;
    }

    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void setId(int id) {
        this.id = id;
    }
}
