package com.bdg.lesson_21_40;


/**
 * @author William Arustamyan
 */


public class Application {

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Original Street");
        Employee employee = new Employee("Arman", address);

        System.out.println(employee);

        ImmutableAddress immutableAddress = employee.employeeAddress();
        immutableAddress.addressStreet();
        System.out.println(employee);

    }
}
