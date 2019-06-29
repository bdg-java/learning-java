package com.bdg.agharibyan.bankaccountsystem.common.exception;


public class PhoneNumberNotFoundException extends RuntimeException {

    public final String message;

    public PhoneNumberNotFoundException(int id){
        this.message = "Phone Number with id + {"+ id +"} not found";
    }

    public String getMessage(){
        return this.message;
    }
}
