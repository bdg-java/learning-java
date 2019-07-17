package com.bdg.Lesson_10;

public abstract class Employee extends Person{
    protected SalaryInformation info;
    protected int refNumber;

    public Employee(SalaryInformation info, String name, String surName, int age) {
        super(name, surName, age);
    }

        public abstract Profession profession();

        public final void addRefNumber(int ref) {
            this.refNumber = ref;
    }
}
