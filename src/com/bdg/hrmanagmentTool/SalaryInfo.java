package com.bdg.hrmanagmentTool;

public class SalaryInfo {

    protected  String cardNumber;
    protected int salary;

    SalaryInfo(String cardNumber, int salary){
        this.cardNumber = cardNumber;
        this.salary = salary;
    }

    public String getCardNumber(){
        return this.cardNumber;
    }

    public int getSalary(){
        return this.salary;
    }
}
