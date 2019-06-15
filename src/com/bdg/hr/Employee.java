package com.bdg.hr;

public abstract class Employee extends Person {

    protected SalaryInfo salaryInfo;
    protected int referenceNumber;

    public Employee(SalaryInfo info, String name, String surname, int age) {
        super(name, surname, age);
        this.salaryInfo = info;
    }

    protected abstract Profession profession();

    public final void addReferenceNumber(int ref) {
        this.referenceNumber = ref;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return  true;
        }
        if(this.name == ((Employee)obj).name){
            return true;
        }
        return false;
    }
}
