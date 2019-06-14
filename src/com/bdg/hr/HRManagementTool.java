package com.bdg.hr;

//Add employee classes, Accouter, HumanResource, MarketSpecialist

public class HRManagementTool {

    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;

    public HRManagementTool(int initialSize) {
        this.employees = new Employee[initialSize];
    }

    public HRManagementTool() {
        this(DEFAULT_CONTAINER_SIZE);
    }

    public boolean addEmployee(Employee employee) {
        //implement this
        return false;
    }

    public Employee[] findByProfession(Profession profession) {
        //implement this
        return null;
    }

    public boolean removeEmployee(Employee employee) {
        //implement this
        return false;
    }

    public Employee[] removeByName(String name) {
        //implement this
        return null;
    }

    public Employee[] removeByNames(String... names) {
        //implement this
        return null;
    }

    public Employee[] removeWithSalaryRange(int from, int to) {
        //implement this
        return null;
    }

    public boolean contains(Employee employee) {
        //implement this
        //check with first Name and lastName
        return false;
    }

    public Employee[] findByName(String employeeName) {
        //implement this
        return null;
    }

    public Employee findByCardNumber(String cardNumber) {
        //implement this
        return null;
    }

    public Employee[] findEmployeeWithSalaryRange(int from, int to) {
        //implement this
        return null;
    }

    public Employee increaseSalary(Employee employee, int newSalarySize) {
        //implement this
        return null;
    }

    public int totalSalary() {
        //implement this
        return -1;
    }

    private void increaseSize() {
        //implement this
    }

}
