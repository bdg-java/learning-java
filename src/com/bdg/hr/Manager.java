package com.bdg.hr;

public class Manager extends Employee {

    public final Profession profession = new Profession("Manager");

    public Manager(SalaryInfo info, String name, String surname, int age) {
        super(info, name, surname, age);
    }

    public Profession profession() {
        return this.profession;
    }
}
