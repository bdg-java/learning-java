package com.bdg.managementTool;

public abstract class Employee extends Person {
    protected SalaryInfo info;
    protected int referenceNumber;

    public Employee(SalaryInfo info, String name, String surname, int age) {
        super(name, surname, age);
        this.info = new SalaryInfo("info" ,10);



    }

    public abstract Profession profession();

    public void addReferenceNumber(int ref) {
        this.referenceNumber = ref;
    }
}
