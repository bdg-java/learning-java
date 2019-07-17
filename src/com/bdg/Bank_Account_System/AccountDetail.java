package com.bdg.Bank_Account_System;

public class AccountDetail extends AbstractBankEntity {

    private  String accountDetail;

    public AccountDetail(int id,String accountDetail){
        super(id);
        this.accountDetail=accountDetail;
    }

    public String getAccountDetail() {
        return accountDetail;
    }

    public void setAccountDetail(String accountDetail) {
        this.accountDetail = accountDetail;
    }

    @Override
    public String toString() {
        return "AccountDetail{" +
                "accountDetail='" + accountDetail + '\'' +
                '}';
    }
}
