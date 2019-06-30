package com.bdg.agharibyan.bankaccountsystem.common.exception;

public class CreditCardNotFoundException extends RuntimeException{

    public final String message;

    public CreditCardNotFoundException(int id){

        this.message = "Credit Card with id {" + id + "} not found";

    }

    public String getMessage(){
        return this.message;
    }

}
