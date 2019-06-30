package com.bdg.agharibyan.bankaccountsystem.common.exception;

public class AccountNotFoundException extends RuntimeException {

    private final String message;

    public AccountNotFoundException(int id){
        this.message = "Account with id{" + id + "} not found";
    }

    public String getMessage(){
        return this.message;
    }
}
