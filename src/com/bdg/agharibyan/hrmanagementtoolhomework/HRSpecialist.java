package com.bdg.agharibyan.hrmanagementtoolhomework;

public class HRSpecialist extends Employee {


    private Profession profession;

    public HRSpecialist(SalaryInfo info, String name, String surname, int age) {
        super(info, name, surname, age);
        this.profession = new Profession("Human Resource Specialist");
    }

    public Profession profession() {
        return this.profession;
    }
}
