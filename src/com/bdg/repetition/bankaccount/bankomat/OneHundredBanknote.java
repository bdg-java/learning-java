package com.bdg.repetition.bankaccount.bankomat;


/**
 * @author William Arustamyan
 */


public final class OneHundredBanknote implements Banknote<Integer>{

    private static final int value = 100;

    @Override
    public Integer value() {
        return value;
    }
}
