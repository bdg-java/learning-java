package com.bdg.agharibyan.bankaccountsystem.service.creditcard;

import java.util.Random;

public class CreditCardNumberGenerator {

    private Random random = new Random();

    public String generate(){
        int low = 10000;
        StringBuilder randomNumberAsString = new StringBuilder();
        for(int i = 0; i < 4; i++){   // inchpes grem, vor 0ov chskselu depqum 0n gri?
            randomNumberAsString.append(random.nextInt(low)).append(" ");
        }
        return randomNumberAsString.toString();
    }
}
