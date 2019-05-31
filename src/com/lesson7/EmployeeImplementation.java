package com.lesson7;

public class EmployeeImplementation {
    public static void main(String[] args) {
        Employee e1 = Employee.createEmployee(1, "LastName1", "FirstName1", 2);
        Employee e2 = Employee.createEmployee(2, "LastName2", "FirstName2", 3);
        Employee e3 = Employee.createEmployee(3, "LastName3", "FirstName3", 0);

        System.out.println("LastName of e1 " + e1.getLastName());
        System.out.println("FirstName of e2 " + e2.getFirstName());
        System.out.println("Salary of e1 " + e1.getSalary());
        System.out.println("AnnualSalary of e2 " + e2.getAnnualSalary());
        System.out.println(e1);
    }
}
