package com.hr;

public class HRManagementTool {

    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;
    private int currentIndex = 0;
    private int[] freePositionsIds = new int[0];
    private int retiredEmployeeReferenceIndex;

    public HRManagementTool(int initialSize) {
        this.employees = new Employee[initialSize];
    }

    public HRManagementTool() {
        this(DEFAULT_CONTAINER_SIZE);
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int[] getFreePositionsIds() {
        return freePositionsIds;
    }

    private void increaseSize() {
        //implement this
        Employee[] newArray = new Employee[this.employees.length * 2];

        System.arraycopy(this.employees, 0, newArray, 0, this.employees.length);
        this.employees = newArray;
    }

    public boolean addEmployee(Employee employee) {
        //implement this
        if (employee != null) {
            if (employees.length == currentIndex) {
                this.increaseSize();
            }

            if (this.freePositionsIds.length > 0) {
                currentIndex = this.freePositionsIds[0];
            }

            employee.addReferenceNumber(currentIndex + 1);

            this.employees[currentIndex] = employee;
            currentIndex = this.employees.length - 1;
            ++currentIndex;
            return true;
        }
        return false;
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
        if (employee != null) {
            if (retiredEmployeeReferenceIndex == freePositionsIds.length) {
                int[] newArray = new int[this.freePositionsIds.length + 1];

                System.arraycopy(this.freePositionsIds, 0, newArray, 0, this.freePositionsIds.length);
                this.freePositionsIds = newArray;
            }

            freePositionsIds[retiredEmployeeReferenceIndex] = employee.referenceNumber - 1;
            this.employees[employee.referenceNumber - 1] = null;
            ++retiredEmployeeReferenceIndex;

            return true;
        }

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

}
