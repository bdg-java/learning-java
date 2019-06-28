package com.bdg.bankaccountsystem.useful;

import java.util.Random;

public class RandomString {

    private static final char[] CARDNUMBER = ("0123456789").toCharArray();

    public String generateRandomCardNumber(int lenght) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i<lenght; i++) {
            result.append(CARDNUMBER[new Random().nextInt(CARDNUMBER.length)]);
        }
        return result.toString();
    }

}
