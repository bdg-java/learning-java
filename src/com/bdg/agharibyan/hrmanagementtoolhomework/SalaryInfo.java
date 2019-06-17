package com.bdg.agharibyan.hrmanagementtoolhomework;

public class SalaryInfo {

    private String cardNumber;
    private int salary;

    public SalaryInfo(String  cardNumber, int salary){
        this.cardNumber = cardNumber;
        this.salary = salary;
    }

    public String getCardNumber(){
        return this.cardNumber;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int newSalary){
        this.salary = newSalary;
    }

    @Override
    public String toString(){
        return  "{carrdNumber='" + cardNumber + "\'," +
                "salary='" + salary + '\'' +
                '}'
                ;
    }
}
