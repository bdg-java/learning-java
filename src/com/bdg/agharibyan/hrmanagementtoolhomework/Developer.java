package com.bdg.agharibyan.hrmanagementtoolhomework;

public class Developer extends Employee{

    public Developer(SalaryInfo info, String name, String surname, int age){
        super(info, name, surname, age);
    }

    public Profession profession(){
        return new Profession("Developer");
    }
}
