package com.bdg.hrmanagmentTool;

public class Accounter extends  Employee{
    public Accounter(SalaryInfo info, String name, String surname, int age) {
        super(info, name, surname, age);
    }

    public Profession profession(){
        return new Profession("Accounter");
    }

    public String toString(){
        return "Accounter" + name;
    }
}
