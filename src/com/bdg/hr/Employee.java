package com.bdg.hr;

public abstract class Employee extends Person {

    protected SalaryInfo info;
    protected int referenceNumber;

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Employee(SalaryInfo info, String name, String surname, int age) {
        super(name, surname, age);
        this.info = info;
    }

    public abstract Profession profession();

    public void addReferenceNumber(int ref) {
        this.referenceNumber = ref;
    }
    public boolean equals(Object obj){
        return true;
    }
}
