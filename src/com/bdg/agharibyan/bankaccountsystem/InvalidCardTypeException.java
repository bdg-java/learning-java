package com.bdg.agharibyan.bankaccountsystem;

public class InvalidCardTypeException extends RuntimeException{

    private final String cardType;

    public InvalidCardTypeException(String cardType){
        this.cardType = cardType;
    }

}
