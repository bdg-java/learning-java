package com.bdg.agharibyan.hrmanagementtoolhomework;

import java.util.Arrays;

public class HRManagementTool {

    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;
    private int currentIndex = 0;

    public HRManagementTool(int initialSize){
        this.employees = new Employee[initialSize];
    }

    public HRManagementTool(){
        this(DEFAULT_CONTAINER_SIZE);
    }

    public boolean addEmployee(Employee employee){
        if(this.employees.length ==  currentIndex){
            this.increaseSize();
        }
        if(employee != null) {
            this.employees[currentIndex] = employee;
            currentIndex++;
            return true;
        }
        return false;
    }

    private void increaseSize(){
        Employee[] newBigStaff = new Employee[this.employees.length*2];
        System.arraycopy(this.employees, 0, newBigStaff, 0, this.employees.length);
        this.employees = newBigStaff;
    }

    public void currentStaff(){
        System.out.println("Current employees quantity: " + currentIndex + ", Current staff:"+ Arrays.toString(this.employees));
    }

    public Employee [] findByProfession(Profession profession){
        Employee[] employeesFoundByProfessionWithNull = new Employee[currentIndex];
        int k = 0;
        for(int i = 0; i < currentIndex; i++) {
            if (this.employees[i].profession().equals(profession)) {
                employeesFoundByProfessionWithNull[k] = this.employees[i];
                k++;
            }
        }
        if (k > 0){
            Employee [] employeesFoundByProfession = new Employee[k];
            System.arraycopy(employeesFoundByProfessionWithNull,0,employeesFoundByProfession,0,k);
            return employeesFoundByProfession;
        }
        return null;
    }

    public boolean removeEmployee(Employee employee){
        int thisEmployeeIndex = -1;
        for(int i = 0; i < currentIndex; i++){
            if(this.employees[i].equals(employee)) {
                thisEmployeeIndex = i;
            }
        }
        if(thisEmployeeIndex != -1){
            Employee[] staffAfterRemoveEmployee = new Employee[currentIndex-1];
            System.arraycopy(this.employees, 0, staffAfterRemoveEmployee, 0, thisEmployeeIndex);
            System.arraycopy(this.employees, thisEmployeeIndex+1, staffAfterRemoveEmployee, thisEmployeeIndex, currentIndex-thisEmployeeIndex-1 );
            currentIndex--;
            this.employees = staffAfterRemoveEmployee;
            return true;
        }
        return false;
    }

    public Employee[] removeByName(String name){
        Employee[] removableEmployeesByName = this.findByName(name);
        for(Employee employee: removableEmployeesByName){
            this.removeEmployee(employee);
        }
        return removableEmployeesByName;
    }

    public Employee[] removeByNames(String... names){
        Employee[] removableEmployeesByNamesWithNull = new Employee[currentIndex];
        int k = 0;
        for(String name:names){
            Employee[] employeesByName = this.removeByName(name);
            for(Employee employee: employeesByName){
                removableEmployeesByNamesWithNull[k] = employee;
                k++;
            }
        }
        Employee[] removableEmployeesByNames = new Employee[k];
        for(int i = 0; i < k; i++){
            removableEmployeesByNames[i] = removableEmployeesByNamesWithNull[i];
        }
        return removableEmployeesByNames;
    }

    public Employee[] removeWithSalaryRange(int from, int to){
        Employee[] removableEmployeesWithSalaryRange = this.findEmployeeWithSalaryRange(from,to);
        for(Employee employee: removableEmployeesWithSalaryRange){
            this.removeEmployee(employee);
        }
        return removableEmployeesWithSalaryRange;
    }

    public boolean contains (Employee employee){
        for(int i = 0; i < currentIndex; i++){
            if(employees[i].name.equals(employee.name) && employees[i].surname.equals(employee.surname)){
                return true;
            }
        }
        return false;
    }

    public Employee[] findByName(String employeeName){
        Employee[] employeesFoundByNameWithNull = new Employee[currentIndex];
        int k = 0;
        for(int i = 0; i < currentIndex; i++){
            if(this.employees[i].name.equals(employeeName)){
                employeesFoundByNameWithNull[k] = this.employees[i];
                k++;
            }
        }
        Employee[] employeesFoundByName = new Employee[k];
        System.arraycopy(employeesFoundByNameWithNull,0,employeesFoundByName,0,k);
        return employeesFoundByName;
    }

    public Employee[] findByCardNumber(String cardNumber){
        Employee[] employeesFoundFyCardNumberWithNull = new Employee[currentIndex];
        int k = 0;
        for(int i = 0; i < currentIndex; i++){
            if(this.employees[i].getSalaryInfo().getCardNumber().equals(cardNumber)){
                employeesFoundFyCardNumberWithNull[k] = this.employees[i];
                k++;
            }
        }
        Employee[] employeesFoundFyCardNumber = new Employee[k];
        System.arraycopy(employeesFoundFyCardNumberWithNull,0,employeesFoundFyCardNumber,0,k);
        return employeesFoundFyCardNumber;
    }

    public Employee[] findEmployeeWithSalaryRange(int from, int to){
        Employee[] findEmployeeWithSalaryRangeWithNull = new Employee[currentIndex];
        int k = 0;
        for(int i = 0; i < currentIndex; i++){
            if(employees[i].getSalaryInfo().getSalary() > from && employees[i].getSalaryInfo().getSalary()< to){
                findEmployeeWithSalaryRangeWithNull[k] = employees[i];
                k++;
            }
        }
        Employee[] findEmployeeWithSalaryRange = new Employee[k];
        System.arraycopy(findEmployeeWithSalaryRangeWithNull,0,findEmployeeWithSalaryRange,0,k);
        return findEmployeeWithSalaryRange;
    }

    public Employee increaseSalary(Employee employee, int newSalarySize){
        Employee employeeWithIncreasableSalary = this.employees[0];
        for(int i = 0; i < currentIndex; i++){
            if(this.employees[i].equals(employee)){
                employeeWithIncreasableSalary = this.employees[i];
                employeeWithIncreasableSalary.getSalaryInfo().setSalary(newSalarySize);
            }
        }
        return employeeWithIncreasableSalary;
    }

    public int totalSalary(){
        int totalSalary = 0;
        for(int i = 0; i< currentIndex; i++){
            totalSalary += this.employees[i].getSalaryInfo().getSalary();
        }
        return totalSalary;
    }


}