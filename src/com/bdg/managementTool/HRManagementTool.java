package com.bdg.managementTool;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HRManagementTool {
    public Employee[] getEmployees() {return employees;}
    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;


    private int currentEmployeeCount;

    public HRManagementTool(int initialSize) {
        this.employees = new Employee[initialSize];
        currentEmployeeCount = 0;
    }



    public HRManagementTool() {
        this(DEFAULT_CONTAINER_SIZE);
    }

    public boolean addEmployee(Employee employee) {
        if (this.currentEmployeeCount == this.employees.length) {
            this.resize();
        }
        this.employees[this.currentEmployeeCount] = employee;
        this.currentEmployeeCount++;
        return true;
    }
    private void resize() {
        Employee[] resizedEmployee = new Employee[this.employees.length + this.employees.length / 2];
        int k = 0;
        for (Employee employee : this.employees) {
            resizedEmployee[k] = employee;
            k++;
        }
        this.employees = resizedEmployee;
    }
    public boolean removeEmployee(Employee employee) {
        if (this.currentEmployeeCount == this.employees.length) {
            this.resizeMinus();
        }
        this.employees[this.currentEmployeeCount] = employee;
        if(currentEmployeeCount > 1) {
            this.currentEmployeeCount--;
            return true;
        }
        currentEmployeeCount = 1;
        return false;
    }

    private void resizeMinus() {
        Employee[] resizeMinusEmployee = new Employee[this.employees.length];
        employees = Arrays.copyOf(employees, employees.length -1);


        this.employees = resizeMinusEmployee;
    }


    public Employee[] findByProfession(Profession profession) {

        ArrayList<Employee> professionOfemployee = new ArrayList<>();
        for(Employee i: professionOfemployee){
            if(i == null){
                return null;
            }
           if(i.profession().name().equals(profession.name())){
                 this.employees = findByProfession(i.profession());
           }
        }

            return employees;
        }

        public Employee[] removeByName (String  name){

            String[] arrayofString = name.split(",");
            for (int i = 0; i < arrayofString.length; i++) {
                ArrayList<Employee> employeeRemoveName = new ArrayList<>();
                for (Employee emp : employeeRemoveName) {
                    if (emp != null) {
                        this.employees = removeByName(emp.name);

                    }else{
                      return   null;
                    }
                }

            }
            return this.employees;
        }


    public Employee[] removeByNames(String... names) {
        ArrayList<Employee> employe = new ArrayList<>();

//        for(Employee i: employe){
//            if(i != null &&  employe.){
//                this.employees = removeByNames(i.names());
//
//
//            }else{
//                return null
//            }
//    }
//        return this.employees;e
 return null;
    }

    public Employee[] removeWithSalaryRange(int from, int to) {
        //implement this
        return null;

//        ArrayList<Employee> emp = new ArrayList<>();
//               for (int i = 0; i < employees.length; i++) {
//                   if(employees[i].info.getSalary() > to && employees[i].info.getSalary() < from){
//                       emp.remove(this.employees);
//                   }
//        }
//        return this.employees;
    }

    public boolean contains(Employee employee) {
        //implement this
        ArrayList<Employee> emp = new ArrayList<>();
        for(Employee fullName :employees){
              if(fullName.name.equals(fullName.name) && fullName.surname.equals(fullName.surname)){
                  return true;
            }

            }
        return false;
    }


    public Employee[] findByName(String employeeName) {

        ArrayList<Employee> emp = new ArrayList<>();
        for(Employee employee : employees){
           if(employee.name == employee.name){
               return this.employees;
           };

        }
        return this.employees;
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
