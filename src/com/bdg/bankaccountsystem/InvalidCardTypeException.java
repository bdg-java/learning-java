package com.bdg.bankaccountsystem;

public class InvalidCardTypeException extends RuntimeException {


    public InvalidCardTypeException() {
        System.out.println("Wrong card type");
    }
}
