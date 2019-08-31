package com.bdg.repetition.bankaccount.bankomat;


/**
 * @author William Arustamyan
 */


public class CountedBanknote<B extends Banknote<?>> {

    private final int count;
    private final B banknote;


    public CountedBanknote(final int count, final B banknote) {
        this.count = count;
        this.banknote = banknote;
    }

    public B banknote() {
        return this.banknote;
    }

    public int count() {
        return this.count;
    }
}
