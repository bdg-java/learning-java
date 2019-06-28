package com.bdg.agharibyan.bankaccountsystem.common.exception;

public class InvalidPhoneTypeException extends RuntimeException{

    private final String DEFAULT_MESSAGE = "Phone type not found with name %s...";
    private final String massage;

    public InvalidPhoneTypeException(String phoneType){
        this.massage = String.format(DEFAULT_MESSAGE, phoneType);
    }

    public String getMassage(){
        return this.massage;
    }
}
