package com.bdg.agharibyan.bankaccountsystem.common.exception;

public class CustomerNotFoundException extends RuntimeException{

    public final String message;

    public CustomerNotFoundException(int id){

        this.message = "Customer with id{" + id + "} not found";

    }

    public String getMessage(){
        return this.message;
    }
}
