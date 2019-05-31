package com.bdg.classes;

public class Employee {
    private  int id;
    private  String firstName;
    private  String lastName;
    private  int salary;

    public Employee(int id,String firstName,String lasttName,int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lasttName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int sallary) {
        this.salary = sallary;
    }

    public int getAnnualSallary(){
        return getSalary()*12;
    }
    public int raiseSalary(int percent){
        return this.salary += (this.salary * percent)/100;
    }

    public String toString(){
        return "Employee[ id = "+ getId()+" , name = "+getFirstName()+getLastName()+" , sallary = "+ getSalary();
    }
}
