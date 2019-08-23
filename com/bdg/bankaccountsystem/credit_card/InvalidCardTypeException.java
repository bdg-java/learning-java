package com.bdg.bankaccountsystem.credit_card;

public class InvalidCardTypeException extends RuntimeException {


    public InvalidCardTypeException() {
        System.out.println("Wrong card type");
    }
}
