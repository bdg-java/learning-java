package com.bdg.agharibyan.bankaccountsystem.service.creditcard;

import java.util.Random;

public class CreditCardNumberGenerator {

    private Random random = new Random();

    public String generate(){
        int low = 1000;
        StringBuilder randomNumberAsString = new StringBuilder();
        for(int i = 0; i < 4; i++){   // inchpes grem, vor 1ov chsksi?
            randomNumberAsString.append(low + random.nextInt(low)).append(" ");
        }
        return randomNumberAsString.toString();
    }
}
