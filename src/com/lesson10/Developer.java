package com.lesson10;

public class Developer extends Employee {
    private final Profession profession = new Profession("Developer");
    public Developer(SalaryInfo info, String name, String surname, int age) {
        super(info, name, surname, age);
    }

    @Override
    public Profession profession() {
        return this.profession;
    }

    public String toString() {
        return "Developer [" + super.toString().replace("]", ": ") + this.info.getSalary() + " " + this.profession().name() + "]";
    }
}
