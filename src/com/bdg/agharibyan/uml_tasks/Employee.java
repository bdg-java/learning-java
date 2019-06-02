package com.bdg.agharibyan.uml_tasks;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        return this.firstName + this.lastName;
    } // chisht em grel? +ov OK e?
    public int GetSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        int AnnualSalary = salary * 12;
        return AnnualSalary;
    }
    public int raiseSalary(int percent){
        int salary = this.salary + this.salary * percent / 100;
        return salary;
    }
    public String toString(){
        return "Employee[id="+ this.id +",name="+ this.firstName +" "+ this.lastName +",salary="+ this.salary +"]";
    }
}
