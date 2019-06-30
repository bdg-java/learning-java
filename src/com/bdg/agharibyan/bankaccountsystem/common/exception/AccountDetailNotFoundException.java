package com.bdg.agharibyan.bankaccountsystem.common.exception;

public class AccountDetailNotFoundException extends RuntimeException {

    private final String message;

    public AccountDetailNotFoundException(int id){

        this.message = "Account Detail with id {" + id + "} not found";

    }

    public String getMessage(){
        return this.message;
    }
}
