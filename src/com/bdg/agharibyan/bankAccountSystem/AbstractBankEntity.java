package com.bdg.agharibyan.bankAccountSystem;

import com.bdg.agharibyan.datewithstaticmethodcreation.DateStatic;

public abstract class AbstractBankEntity {

    protected int id;
    protected DateStatic createdDate;
    protected DateStatic updatedDate;

    public AbstractBankEntity(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public DateStatic getCreatedDate() {
        return createdDate;
    }

    public DateStatic getUpdatedDate() {
        return updatedDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreatedDate(DateStatic createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(DateStatic updatedDate) {
        this.updatedDate = updatedDate;
    }
}
