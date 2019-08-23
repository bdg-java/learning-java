package com.bdg.bankomat;

public enum Banknotes {
    FIFTY(50),
    HUNDRED(100),
    FIVE_HUNDRED(500),
    ONE_THOUSAND(1000),
    FIVE_THOUSAND(5000);

    private int amount;

    Banknotes(int amount){
        this.amount =amount;
    }

    public int getAmount() {
        return amount;
    }
}
