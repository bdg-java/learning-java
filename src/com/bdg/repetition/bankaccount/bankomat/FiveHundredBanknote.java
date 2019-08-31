package com.bdg.repetition.bankaccount.bankomat;

public final class FiveHundredBanknote implements Banknote<Integer>{

    private static final int value = 500;

    @Override
    public Integer value() {
        return value;
    }
}
