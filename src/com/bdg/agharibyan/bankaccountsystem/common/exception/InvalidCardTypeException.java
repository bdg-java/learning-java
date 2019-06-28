package com.bdg.agharibyan.bankaccountsystem.common.exception;

public class InvalidCardTypeException extends RuntimeException{

    private final String DEFAULT_MESSAGE = "Card type not found with name %s..."; //%n aystegh functional uni? te henc 5 el artatpum e?
    private final String message;

    public InvalidCardTypeException(String cardType){
        this.message = String.format(DEFAULT_MESSAGE, cardType); //artatpvelu e DEFAULT_MESSAGEy ev cardTypen aranc storaketi?
    }

    public String getMessage(){
        return this.message;
    }
}
