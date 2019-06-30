package com.bdg.agharibyan.bankaccountsystem.common.exception;

public class AddressNotFoundException extends RuntimeException{

    private final String message;

    public AddressNotFoundException(int id){

        this.message = " Address with id {" + id + "} not found";
    }

    public String getMessage(){
        return this.message;
    }

}
