package com.bdg.bankaccounsystem.creditcard;

import java.time.LocalDate;

public abstract class AbstractEntity {
    protected int id;
    protected LocalDate created;
    protected LocalDate deleted;
    protected LocalDate updated;

    public void setId(int id) {
        this.id = id;
    }
}
