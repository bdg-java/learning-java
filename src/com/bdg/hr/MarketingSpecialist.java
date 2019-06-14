package com.bdg.hr;

public class MarketingSpecialist extends Employee {

    public final Profession profession = new Profession("Marketing Specialist");

    public MarketingSpecialist(SalaryInfo info, String name, String surname, int age) {
        super(info, name, surname, age);
    }

    public Profession profession() {
        return this.profession;
    }
}
