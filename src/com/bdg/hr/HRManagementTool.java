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
        boolean flag = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            } else {
                flag = true;
            }
        }

        return this.increaseEmployeesArray(flag, employee);
    }

    public Employee[] findByProfession(Profession profession) {
        Employee[] employeesByProfession = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null &&
                    employees[i].profession().getProfessionName().
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
            if (employees[i] != employee){
                removedEmployee[i] = employee;
            }else {
                flag = true;
            }
        }
        employees = removedEmployee;
        return flag;
    }

    public Employee[] removeByName(String name) {
        Employee[] removedEmployee = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && !employees[i].name.equals(name)){
                removedEmployee[i] = employees[i];
            }
        }
        employees = removedEmployee;
        return employees;
    }

    public Employee[] removeByNames(String...  names) {

        Employee[] removedEmployee = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < names.length; j++) {
                if(employees[i] !=null && !employees[i].name.equals(names[i])){

                    removedEmployee[i] = employees[i];
                }
            }
        }
        employees = removedEmployee;
        return employees;
    }

    public Employee[] removeWithSalaryRange(int from, int to) {
        Employee[] removedEmployee = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {

            if(employees[i] != null && (employees[i].salaryInfo.getSalary() <from ||
                    employees[i].salaryInfo.getSalary() >to)
            ){
                System.out.println(employees[i].salaryInfo.getSalary());
                removedEmployee[i] = employees[i];
            }

        }
        return removedEmployee;
    }

    public boolean contains(Employee employee) {
       boolean status = false;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].name.equals(employee.name) &&
                employees[i].surname.equals(employee.surname)
            ){
                status = true;
                break;
            }
        }
        return status;
    }

    public Employee[] findByName(String employeeName) {
        Employee[] employeeByName = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].name.equals(employeeName))
            {
                employeeByName[i] = employees[i];
            }
        }
        return employeeByName;
    }

    public Employee findByCardNumber(String cardNumber) {
        Employee employeeByCardNumber =null;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].salaryInfo.getCardNumber().
                    equals(cardNumber))
            {
                employeeByCardNumber = employees[i];
            }
        }
        return employeeByCardNumber;
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


    private boolean increaseEmployeesArray(boolean flag, Employee employee) {
        if (flag) {
            Employee[] newEmployees = new Employee[employees.length + DEFAULT_CONTAINER_SIZE];
            for (int i = 0; i < employees.length; i++) {
                newEmployees[i] = employees[i];
            }
            newEmployees[employees.length] = employee;
            employees = newEmployees;
            return true;
        }

        return false;
    }


}
