package com.lesson7;

public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private int salary;

    private Employee(int id, String lastName, String firstName, int salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public static Employee createEmployee(int id, String lastName, String firstName, int salary) {
        if (salary < 0)
            return null;
        else return new Employee(id, lastName, firstName, salary);
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        if (salary < 0)
            System.out.println("Salary is not valid........");
        else this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        return salary += salary * percent / 100;
    }

    @Override
    public String toString() {
        return "Lastname: " + this.lastName + " FirstName: " + this.firstName + " Id: " + this.id + " Salary: " + this.salary;
    }
}
