package com.bdg.inheritance;

public  class Employee extends Person {
    protected int salary;


    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
}
