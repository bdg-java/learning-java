package com.bdg.repetition.bankaccount.bankomat;


/**
 * @author William Arustamyan
 */


public final class FiveThousandBanknote implements Banknote<Integer> {

    private static final int value = 5000;

    @Override
    public Integer value() {
        return value;
    }
}
