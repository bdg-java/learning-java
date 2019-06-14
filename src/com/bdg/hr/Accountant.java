package com.bdg.hr;

public class Accountant extends Employee {

    public final Profession profession = new Profession("Accountant");

    public Accountant(SalaryInfo info, String name, String surname, int age) {
        super(info, name, surname, age);
    }

    public Profession profession() {
        return this.profession;
    }
}
