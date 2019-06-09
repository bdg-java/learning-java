package com.bdg.agharibyan.hrmanagementtoolhomework;

public class HRSpecialist extends Employee{

    public HRSpecialist(SalaryInfo info, String name, String surname, int age){
        super(info, name, surname, age);
    }

    public Profession profession(){
        return new Profession("Human Resource Specialist");
    }
}
