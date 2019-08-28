package com.bdg.Homework.Bankomat;

public enum Banknote {


    TEN_THOUSAND(2000),
    FIVE_THOUSAND(5000),
    ONE_THOUSAND(1000);


    private int amount;
    Banknote(int amount){
        this.amount =amount;
    }

    public int getAmount() {
        return amount;
    }
}
