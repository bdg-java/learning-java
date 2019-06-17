package com.bdg.agharibyan.hrmanagementtoolhomework;

public class Developer extends Employee{

    private final Profession profession = new Profession("Developer");

    public Developer(SalaryInfo info, String name, String surname, int age){
        super(info, name, surname, age);
    }

    @Override
    public Profession profession() {
        return this.profession;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "profession=" + profession +
                ", info=" + info +
                ", referenceNumber=" + referenceNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
