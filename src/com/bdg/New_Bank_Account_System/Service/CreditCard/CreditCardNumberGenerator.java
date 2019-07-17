package com.bdg.New_Bank_Account_System.Service.CreditCard;

import java.util.Random;


public class CreditCardNumberGenerator {

    private Random random = new Random();

    public String generate() {
        int low = 1000;
        StringBuilder randomNumberAsString = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            randomNumberAsString.append(low + random.nextInt(low)).append(".");
        }
        return randomNumberAsString.toString();
    }
}