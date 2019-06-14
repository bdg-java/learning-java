package com.bdg.agharibyan.hrmanagementtoolhomework;

public class MarketSpecialist extends Employee{

    private Profession profession = new Profession("Marketing Specialist");

    public MarketSpecialist(SalaryInfo info, String name, String surname, int age){
        super(info, name, surname, age);
    }

    @Override
    public Profession profession() {
        return this.profession;
    }
}
