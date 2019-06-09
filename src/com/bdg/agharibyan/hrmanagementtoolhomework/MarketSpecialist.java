package com.bdg.agharibyan.hrmanagementtoolhomework;

public class MarketSpecialist extends Employee{

    public MarketSpecialist(SalaryInfo info, String name, String surname, int age){
        super(info, name, surname, age);
    }

    public Profession profession(){
        return new Profession("Marketing Specialist");
    }
}
