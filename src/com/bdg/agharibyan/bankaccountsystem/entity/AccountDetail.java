package com.bdg.agharibyan.bankaccountsystem.entity;

public final class AccountDetail extends AbstractBankEntity { //petq e zharangi AbstractBankEntityic?
    // chgtem detail mej inch a petq grel

    private int accountNumber;


    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
}
