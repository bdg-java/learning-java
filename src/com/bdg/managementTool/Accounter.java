package com.bdg.managementTool;

public class Accounter extends Employee {

    public Accounter( SalaryInfo info, String name, String surename, int age){
        super(info, name, surename, age);
    }
    public Profession profession(){
        return new Profession("Accounter");
    }
}
