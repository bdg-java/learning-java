package com.bdg.hrmanagmentTool;

import java.util.ArrayList;

public class HRManagementTool {
    private Employee[] employees;
    public static final int DEFAULT_CONTAINER_SIZE = 10;

    public int currentIndex = 0;
    protected int referenceNumber;

    public HRManagementTool(int initialSize) {
        this.employees = new Employee[initialSize];

    }

    public HRManagementTool() {
        this(DEFAULT_CONTAINER_SIZE);
    }

    public boolean addEmployee(Employee employee) {

        if (employees.length == currentIndex) {
            this.increaseSize();
        }
        this.employees[currentIndex] = employee;
        currentIndex++;
        return true;
    }

    public void increaseSize() {
        Employee[] newArray = new Employee[employees.length + employees.length / 2];
        System.arraycopy(this.employees, 0, newArray, 0, this.employees.length);
        this.employees = newArray;
    }


    public Employee[] findByProfession(Profession profession) {
       int k = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.profession().equals(profession))
                    k++;
            }
        }
        Employee[] employee = new Employee[k];
        int i = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.profession().equals(profession))
                    employee[i++] = emp;
            }
        }
        return employee;
    }


    public boolean removeEmployee(Employee employee) {
    int removed = -1;
       for (int i = 0; i < currentIndex; i++) {
        if (this.employees[i] != null)
            if (this.employees[i].equals(employee))
                removed = i;
    }


        Employee[] lengthOffEmployee = new Employee[currentIndex];
        int k = 0;
        for (int i = 0; i < currentIndex; i++)
            if(i != removed) {
                lengthOffEmployee[k++] = this.employees[i];
            }
        this.employees = lengthOffEmployee;
        currentIndex--;


        return true;
    }
    public Employee[] findByName(String employeeName) {
        int k = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.name.equals(employeeName))
                    k++;
            }
        }
        Employee[] Nameofemployee = new Employee[k];
        int i = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.name.equals(employeeName))
                    Nameofemployee[i++] = emp;


            }
        }
        return Nameofemployee;
    }


    public Employee[] removeByName(String name) {
           findByName(name);

            for (Employee emp : employees) {
                if (emp.name.equals(name)) {
                    removeEmployee(emp);
                }
            }

        return this.employees;
    }

    public Employee[] removeByNames(String... names) {

        for (int i = 0; i < currentIndex; i++) {
            Employee[] employee = findByName(names[i]);
            for (Employee emp : employee) {
                if (emp != null) {
                    this.employees = removeByName(emp.name);
                }
            }
        }
        return this.employees;
    }

    public Employee[] removeWithSalaryRange(int from, int to) {
        int k = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.info.getSalary() >= from && employee.info.getSalary() <= to)
                    k++;
            }
        }
        Employee[] newEmployee = new Employee[k];
        int i = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.info.getSalary() >= from && employee.info.getSalary() <= to)
                removeEmployee(newEmployee[i]);
            }
        }
        return newEmployee;

    }



    public Employee[] findBySalaryRange(int from, int to) {
        int k = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.info.getSalary() >= from && employee.info.getSalary() <= to)
                    k++;
            }
        }
        Employee[] newEmployee = new Employee[k];
        int i = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.info.getSalary() >= from && employee.info.getSalary() <= to)
                    newEmployee[i++] = employee;
            }
        }
        return newEmployee;
    }


    public boolean contains(Employee employee) {
        boolean a = false;
        Employee[] array = new Employee[currentIndex];
        for (Employee emp : employees) {
            if ((emp.name).equals(employee.name) && (emp.surname).equals(employee.surname)) {
                a = true;
            }
        }

        return a;


    }




    public Employee findByCardNumber(String cardNumber) {

        for(int i = 0; i< currentIndex; i++){
            if(employees[i].info.getCardNumber().equals(cardNumber) && (employees[i].info.getCardNumber() != null)){
                return employees[i];
            }
        }
        return null;
    }



    public int increaseSalary(Employee employee, int newSalarySize) {
        int i = 0;
        for (Employee emp : this.employees) {
            if (employee != null) {
                if (emp.info.getSalary() != 0)
                 i = emp.info.getSalary() + newSalarySize;
            }
        }

        return i;
    }

    public int totalSalary() {
        int total = 0;
        for (int i = 0; i < currentIndex; i++) {
            total += employees[i].info.getSalary();
        }
         return total;
    }

}
