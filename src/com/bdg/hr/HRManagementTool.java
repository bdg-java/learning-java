package com.bdg.hr;

<<<<<<< HEAD
//Add employee classes, Accouter, HumanResource, MarketSpecialist

=======

//Add employee classes, Accouter, HumanResource, MarketSpecialist


>>>>>>> cc0ea979183e2492dac5e93356b05a3bd25970d8
public class HRManagementTool {

    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;
    private int currentIndex = 0;

    public HRManagementTool(int initialSize) {
        this.employees = new Employee[initialSize];
    }

    public HRManagementTool() {
        this(DEFAULT_CONTAINER_SIZE);
    }

    public boolean addEmployee(Employee employee) {
        //implement this
        if (employees.length == currentIndex) {
            this.increaseSize();
        }
        this.employees[currentIndex] = employee;
        currentIndex++;
        return true;
    }

    public Employee[] findByProfession(Profession profession) {
        //implement this
        Employee[] foundEmpl = new Employee[this.currentIndex];
        int k = 0;
        for (Employee employee : this.employees) {
            if (employee.profession().equals(profession)) {
                foundEmpl[k] = employee;
                k = k + 1;
            }
        }
        if (k > 0) {
            Employee[] returnEmpl = new Employee[k];
            for (int i = 0; i < k; i++) {
                returnEmpl[i] = foundEmpl[i];
            }
            return returnEmpl;
        }
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
        Employee[] newArray = new Employee[this.employees.length + this.employees.length / 2];
//        for (int i = 0; i < employees.length; i++) {
//            newArray[i] = this.employees[i];
//        }
        System.arraycopy(this.employees, 0, newArray, 0, this.employees.length);
        this.employees = newArray;
    }

}
