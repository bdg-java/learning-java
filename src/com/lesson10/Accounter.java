package com.lesson10;

public class Accounter extends Employee {
    private final Profession profession = new Profession("Accounter");

    public Accounter(SalaryInfo info, String name, String surname, int age) {
        super(info, name, surname, age);
    }

    public Profession profession() {
        return this.profession;
    }

    public String toString() {
        return "Accounter [" + super.toString().replace("]", ": ") + this.info.getSalary() + " " + this.profession().name() + "]";
    }
}
