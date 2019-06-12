package com.bdg.managementTool;

public class Developer extends  Employee{
    public Developer(SalaryInfo info, String name, String surname, int age) {
        super(info, name, surname, age);
    }

    @Override
    public Profession profession() {
        return new Profession("Developer");
    }
}
