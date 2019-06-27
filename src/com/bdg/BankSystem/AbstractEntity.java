package com.bdg.BankSystem;

import java.time.LocalDate;

public class AbstractEntity{
    protected int id;
    protected LocalDate created;
    protected LocalDate deleted;
    protected LocalDate updated;

    public void setId(){
        this.id = id;
    }

}
