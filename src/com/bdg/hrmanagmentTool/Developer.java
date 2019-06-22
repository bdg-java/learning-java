package com.bdg.hrmanagmentTool;

public class Developer extends Employee{
    private final Profession profession = new Profession("Developer");

    public Developer(SalaryInfo info, String name, String surname, int age) {
        super(info, name, surname, age);
    }

    public Profession profession(){
//        return new Profession("Developer");
        return this.profession;

    }

    public String toString(){
        return "Developer" + " "  + name;

    }



}
