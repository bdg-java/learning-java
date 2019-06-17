package com.hr;

public class HRManagementTool {

    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;
    private int currentIndex = 0;
    private int[] freePositionsIds = {-1};
    public int freePositionsIdsCount;
    int temp = 0;

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
            if (freePositionsIds[0] == -1) {
                if (employees.length == currentIndex) {
                    this.increaseSize();
                }

                this.employees[currentIndex] = employee;

                employee.addReferenceNumber(currentIndex + 1);

                ++currentIndex;
                return true;
            }

            if (freePositionsIds.length == 1 && freePositionsIds[0] != -1) {
                employees[freePositionsIds[0]] = employee;
                employee.addReferenceNumber(freePositionsIds[0] + 1);
                freePositionsIds[0] = -1;
                freePositionsIdsCount = freePositionsIdsCount - 1;
            }

            if (freePositionsIds.length > 1) {
                employees[freePositionsIds[0]] = employee;
                employee.addReferenceNumber(freePositionsIds[0] + 1);

                int[] newArray = new int[this.freePositionsIds.length - 1];

                System.arraycopy(this.freePositionsIds, 1, newArray, 0, newArray.length);
                this.freePositionsIds = newArray;
                freePositionsIdsCount = freePositionsIdsCount - 1;
            }
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

    public void increaseSizeOfFreePositionsIdsArray() {
        int[] newArray = new int[this.freePositionsIds.length + 1];

        System.arraycopy(this.freePositionsIds, 0, newArray, 0, this.freePositionsIds.length);
        this.freePositionsIds = newArray;
    }

    public boolean removeEmployee(Employee employee) {
        //implement this
        if (employee != null) {
            if (freePositionsIdsCount == freePositionsIds.length) {
                this.increaseSizeOfFreePositionsIdsArray();
            }

            this.employees[employee.referenceNumber - 1] = null;
            freePositionsIds[freePositionsIdsCount] = employee.referenceNumber - 1;
            ++freePositionsIdsCount;

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
