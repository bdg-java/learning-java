package com.bdg.repetition.bankaccount.bankomat;


/**
 * @author William Arustamyan
 */


public final class OneThousandBanknote implements Banknote<Integer> {

    private static final int value = 1000;

    @Override
    public Integer value() {
        return value;
    }
}
