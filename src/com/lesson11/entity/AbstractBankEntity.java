package com.lesson11.entity;

import java.time.LocalDate;
import java.util.Date;

public abstract class AbstractBankEntity {
    protected int id;
    protected LocalDate creditDate;
    protected LocalDate updateDate;
    protected LocalDate deleteDate;


    public LocalDate getCreditDate() {
        return this.creditDate;
    }

    public LocalDate getUpdateDate() {
        return this.updateDate;
    }

    public int getId() {
        return this.id;
    }

    public LocalDate getDeleteDate() {
        return this.deleteDate;
    }

    public void setCreditDate(LocalDate creditDate) {
        this.creditDate = creditDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeleteDate(LocalDate deleteDate) {
        this.deleteDate = deleteDate;
    }
}
