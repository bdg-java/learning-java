package com.lesson10;

import java.util.Arrays;

public class HRManagementTool {
    public Employee[] getEmployees() {
        return employees;
    }

    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 5;

    public HRManagementTool(int initialSize) {
        this.employees = new Employee[initialSize];
    }

    public HRManagementTool() {
        this(DEFAULT_CONTAINER_SIZE);
    }

    private int getCountEmployeeByProfession(Profession profession) {
        Employee[] employee = new Employee[10];
        int j = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.profession().name() == profession.name())
                    j++;
            }
        }
        return j;
    }

    public Employee[] findByProfession(Profession profession) {
        int j = getCountEmployeeByProfession(profession);
        Employee[] employee = new Employee[j];
        int i = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.profession().name() == profession.name())
                    employee[i++] = emp;
            }
        }
        return employee;
    }

    private void ensureSize() {
        int length = this.employees.length;
        if (this.employees[length - 1] != null) {
            Employee[] prevemployee = this.employees;
            increaseSize();
            length = this.employees.length;
            this.employees = Arrays.copyOf(prevemployee, length);
        }
    }

    private int getEmptyPozition() {
        int length = this.employees.length;
        int i = 0;
        for (i = 0; i < length; i++) {
            if (this.employees[i] != null)
                continue;
            else break;
        }
        return i;
    }

    public boolean addEmployee(Employee employee) {
        ensureSize();
        this.employees[getEmptyPozition()] = employee;
        return true;
    }

    private int getRemovePosition(Employee employee) {
        int position = -1;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null)
                if (this.employees[i].equals(employee))
                    position = i;
        }
        return position;
    }

    private void replaceArray(int position) {
        int length = this.employees.length;
        Employee[] temp = new Employee[length - 1];
        int j = 0;
        for (int i = 0; i < length; i++)
            if (i != position)
                temp[j++] = this.employees[i];
        this.employees = temp;
    }

    public boolean removeEmployee(Employee employee) {
        int position = getRemovePosition(employee);
        if (position == -1) return false;
        replaceArray(position);
        return true;
    }

    public Employee[] removeByName(String name) {
        Employee[] employee = findByName(name);
        for (Employee emp : employee) {
            removeEmployee(emp);
        }
        return this.employees;

    }

    public Employee[] removeByNames(String name) {
        String[] arrayofString = name.split(",");
        for (int i = 0; i < arrayofString.length; i++) {
            Employee[] employee = findByName(arrayofString[i]);
            for (Employee emp : employee) {
                if (emp != null) {
                    this.employees = removeByName(emp.name);
                }
            }

        }
        return this.employees;
    }

    public Employee[] removeWithSalaryRange(int from, int to) {
        for (Employee employee : this.employees) {
            if (employee != null)
                if (employee.info.getSalary() >= from && employee.info.getSalary() <= to)
                    removeEmployee(employee);
        }
        return this.employees;
    }

    public boolean contains(Employee employee) {
        for (Employee iemployee : this.employees) {
            if (iemployee != null)
                if (iemployee.name == employee.name && iemployee.surname == employee.surname)
                    return true;
        }
        return false;
    }

    private int getCountEmployeewithSameName(String employeeName) {
        int c = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.name.hashCode() == employeeName.hashCode())
                    c++;
            }
        }
        return c;
    }

    public Employee[] findByName(String employeeName) {
        int c = getCountEmployeewithSameName(employeeName);
        Employee[] newEmployee = new Employee[c];
        int j = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.name.hashCode() == employeeName.hashCode())
                    newEmployee[j++] = employee;
            }
        }
        return newEmployee;
    }

    public Employee findByCardNumber(String cardNumber) {
        for (Employee employee : this.employees)
            if (employee != null) {
                if (employee.info.getCardNumber() == cardNumber)
                    return employee;
            }
        return null;
    }

    private int getCountEmployeesWithSalaryRange(int from, int to) {
        int c = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.info.getSalary() >= from && employee.info.getSalary() <= to)
                    c++;
            }
        }
        return c;
    }

    public Employee[] findEmployeeWithSalaryRange(int from, int to) {
        Employee[] newEmployee = new Employee[this.getCountEmployeesWithSalaryRange(from, to)];
        int j = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.info.getSalary() >= from && employee.info.getSalary() <= to)
                    newEmployee[j++] = employee;
            }
        }
        return newEmployee;
    }

    public Employee increaseSalary(Employee employee, int newSalarySize) {
        if (this.contains(employee)) {
            int salary = employee.info.getSalary();
            employee.info.setSalary(salary + newSalarySize * salary / 100);
        }
        return employee;
    }

    public int totalSalary() {
        int result = 0;
        for (Employee employee : this.employees) {
            if (employee != null)
                result += employee.info.getSalary();
        }
        return result;
    }

    private void increaseSize() {
        this.employees = new Employee[this.employees.length + DEFAULT_CONTAINER_SIZE];
    }


}
