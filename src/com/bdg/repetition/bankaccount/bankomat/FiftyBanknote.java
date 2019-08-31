package com.bdg.repetition.bankaccount.bankomat;


/**
 * @author William Arustamyan
 */


public final class FiftyBanknote implements Banknote<Integer> {


    private static final int value = 50;

    @Override
    public Integer value() {
        return value;
    }
}
