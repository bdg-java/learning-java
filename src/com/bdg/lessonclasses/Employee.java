package com.bdg.lessonclasses;

public class Employee {
    private int id;
    private  String firstName;
    private String lastName;
    private int salary;

    public Employee (int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return this.salary*12;
    }

    public int raiseSalary(int percent) {
        percent = this.salary * percent / 100;
        return this.salary += percent;
    }

    public String toString() {
        return "Employee[id: " + this.id + ", name: " + getName() + ", salary: " + salary + "]";
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1001, "John", "Smith", 20);
        System.out.println(emp);
        System.out.println(emp.getAnnualSalary());
        System.out.println(emp.raiseSalary(5));
    }
}
