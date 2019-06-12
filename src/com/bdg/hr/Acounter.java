package com.bdg.hr;

public class Acounter extends Employee {

    public Acounter(SalaryInfo salaryInfo, String name, String surname, int age)
    {
        super(salaryInfo,name,surname,age);
    }

    public Profession profession(){

        return new Profession("Acounter");
    }

}
