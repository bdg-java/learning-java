package com.bdg.managementTool;

public class HRSpecialist extends Employee {

    public HRSpecialist(SalaryInfo info, String name, String surename,int age){
    super(info,name, surename, age);
    }
    public Profession profession(){
        return new Profession("HRSpecialist");
    }

}