package com.bdg.hr;

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

    public Employee[] getEmloyee() {
        return employees;
    }

    public boolean addEmployee(Employee employee) {
        if (employees.length == currentIndex) {
            increaseEmployeesArray();
        }
        employees[currentIndex] = employee;
        currentIndex++;
        return true;
    }

    public Employee[] findByProfession(Profession profession) {
        Employee[] employeesByProfession = new Employee[employees.length];
        for (int i = 0; i < currentIndex; i++) {
            if (employees[i].profession().getProfessionName().
                    equals(profession.getProfessionName())) {
                employeesByProfession[i] = employees[i];
            }
        }
        return employeesByProfession;
    }

    public boolean removeEmployee(Employee employee) {
        Employee[] removedEmployee = new Employee[employees.length];
        boolean flag = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != employee) {
                removedEmployee[i] = employee;
            } else {
                flag = true;
            }
        }
        employees = removedEmployee;
        return flag;
    }

    public Employee[] removeByName(String name) {
        Employee[] removedEmployee = new Employee[employees.length];
        for (int i = 0; i < currentIndex; i++) {
            if (!employees[i].name.equals(name)) {
                removedEmployee[i] = employees[i];
            }
        }
        employees = removedEmployee;
        return employees;
    }

    public Employee[] removeByNames(String... names) {
        Employee[] removedEmployee = new Employee[employees.length];
        for (int i = 0; i < currentIndex; i++) {
            for (int j = 0; j < names.length; j++) {
                if (!employees[i].name.equals(names[j])) {

                    removedEmployee[i] = employees[i];
                }
            }
        }
        employees = removedEmployee;
        return employees;
    }

    public Employee[] removeWithSalaryRange(int from, int to) {
        Employee[] removedEmployee = new Employee[employees.length];
        for (int i = 0; i < currentIndex; i++) {

            if (employees[i].salaryInfo.getSalary() < from ||
                    employees[i].salaryInfo.getSalary() > to
            ) {
                System.out.println(employees[i].salaryInfo.getSalary());
                removedEmployee[i] = employees[i];
            }

        }
        return removedEmployee;
    }

    public boolean contains(Employee employee) {
        boolean status = false;
        for (int i = 0; i < currentIndex; i++) {
            if (employees[i].name.equals(employee.name) &&
                    employees[i].surname.equals(employee.surname)
            ) {
                status = true;
                break;
            }
        }
        return status;
    }

    public Employee[] findByName(String employeeName) {
        Employee[] employeeByName = new Employee[employees.length];
        for (int i = 0; i < currentIndex; i++) {
            if (employees[i].name.equals(employeeName)) {
                employeeByName[i] = employees[i];
            }
        }
        return employeeByName;
    }

    public Employee findByCardNumber(String cardNumber) {
        Employee employeeByCardNumber = null;
        for (int i = 0; i < currentIndex; i++) {
            if (employees[i].salaryInfo.getCardNumber().
                    equals(cardNumber)) {
                employeeByCardNumber = employees[i];
            }
        }
        return employeeByCardNumber;
    }

    public Employee[] findEmployeeWithSalaryRange(int from, int to) {
        Employee[] employeesByRange = new Employee[currentIndex];
        for (int i = 0; i < currentIndex; i++) {
            if (employees[i].salaryInfo.getSalary() > from
                    && employees[i].salaryInfo.getSalary() < to) {
                employeesByRange[i] = employees[i];
            }
        }
        return employeesByRange;
    }

    public Employee increaseSalary(Employee employee, int newSalarySize) {

        for (int i = 0; i < currentIndex; i++) {
            if (employees[i] == employee) {

                employees[i].salaryInfo.setSalary(
                        employees[i].salaryInfo.getSalary() + newSalarySize);
            }
        }
        return employee;
    }

    public int totalSalary() {
        int totalSalary = 0;
        for (int i = 0; i < currentIndex; i++) {
            totalSalary += employees[i].salaryInfo.getSalary();
        }
        return totalSalary;
    }


    private void increaseEmployeesArray() {
        Employee[] newEmployees = new Employee[employees.length + DEFAULT_CONTAINER_SIZE];
        System.arraycopy(employees, 0, newEmployees, 0, currentIndex);
        employees = newEmployees;
    }


}
