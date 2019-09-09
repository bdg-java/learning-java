package com.bdg.agharibyan.hrmanagementtoolhomework;

public class Accounter extends Employee{

    private final Profession profession = new Profession("Accounter");

    public Accounter(SalaryInfo info, String name, String surname, int age){
        super(info, name, surname, age);
    }

    @Override
    public Profession profession() {
        return this.profession;
    }

    @Override
    public String toString() {
        return "Accounter{" +
                "profession=" + profession +
                ", info=" + info +
                ", referenceNumber=" + referenceNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}