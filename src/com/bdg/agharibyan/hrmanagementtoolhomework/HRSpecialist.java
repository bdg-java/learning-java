package com.bdg.agharibyan.hrmanagementtoolhomework;

public class HRSpecialist extends Employee {


    private final Profession profession = new Profession("Human Resource Specialist");

    public HRSpecialist(SalaryInfo info, String name, String surname, int age) {
        super(info, name, surname, age);
    }

    @Override
    public Profession profession() {
        return this.profession;
    }

    @Override
    public String toString() {
        return "HR Specialist{" +
                "profession=" + profession +
                ", info=" + info +
                ", referenceNumber=" + referenceNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
