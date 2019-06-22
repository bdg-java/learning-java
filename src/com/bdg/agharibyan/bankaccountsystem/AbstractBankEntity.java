package com.bdg.agharibyan.bankaccountsystem;

import java.time.LocalDate;

public abstract class AbstractBankEntity {

    protected int id;
    protected LocalDate createdDate;
    protected LocalDate deletedDate;
    protected LocalDate updatedDate;

    public AbstractBankEntity(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getDeletedDate(){
        return deletedDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setDeletedDate(LocalDate deletedDate){
        this.deletedDate = deletedDate;
    }
}
