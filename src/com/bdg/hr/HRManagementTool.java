package com.bdg.hr;

public class HRManagementTool {
    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;

    public HRManagementTool(int initialSize) {
        this.employees = new Employee[initialSize];
    }

    public HRManagementTool() {
        this(DEFAULT_CONTAINER_SIZE);
    }
    private int count= 0;
    public boolean addEmployee(Employee employee) {
        if (employees.length==count){
            this.increaseSize();
        }
        this.employees[count] = employee;
        count++;
        return true;
    }

    private void increaseSize() {
        Employee [] newArray = new Employee[this.employees.length+this.employees.length/2];
        System.arraycopy(this.employees,0,newArray,0,this.employees.length);
        this.employees = newArray;

    }

    public Employee[] findByProfession(Profession profession) {
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].profession().name()== profession.name()){
                System.out.println("Found match" +"\n"+"profession name : "+profession+",index: "+i);
            }
        }
        return null;
    }

    public boolean removeEmployee(Employee employee) {
        Employee [] newArray = new Employee[employees.length-1];
        for (int i = 0; i < employees.length ; i++) {
            if (!employees[i].equals(employee)){
                newArray[i] = employees[i];
                System.out.println("this index is empty : "+i);
            }
        }

        return true;
    }

    public Employee[] removeByName(String name) {
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] != null) {
                if (employees[i].name.equals(name)) {
                    employees[i] = null;
                }
            }
        }
        return employees;
    }

    public Employee[] removeByNames(String... names) {
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i] != null) {
                if (employees[i].name.equals(names)) {
                    employees[i] = null;
                }
            }
        }
        return employees;
    }

    public Employee[] removeWithSalaryRange(int from, int to) {
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] != null) {
                if (employees[i].info.getSalary() > from && employees[i].info.getSalary() < to) {
                    employees[i] = null;
                }
            }
        }
        return employees;
    }

    public boolean contains(Employee employee) {
        boolean bool = false;
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] != null) {
                if (employees[i].name.equals(employee.name) && employees[i].surname.equals(employee.surname))
                    bool = true;
            }
        }

        return bool;
    }

    public Employee[] findByName(String employeeName) {
        int num = 0;
        boolean bool = false;
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i] != null) {
                if (employees[i].name.equals(employeeName)) {
                    num = i;
                }
            }
        }

        return new Employee[]{employees[num]};
    }

    public Employee findByCardNumber(String cardNumber) {
        int num= 0;
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] != null) {
                if (employees[i].info.getCardNumber().equals(cardNumber)) {
                    num = i;
                }
            }
        }
        return employees[num];
    }

    public Employee[] findEmployeeWithSalaryRange(int from, int to) {
        for (int i = 0; i <employees.length ; i++) {
            if (this.employees[i]!=null){
                if (this.employees[i].info.getSalary()>from && this.employees[i].info.getSalary() < to ){
                System.out.println(employees[i].name+" ,"+ employees[i].info.getSalary());
                }
            }
        }
        return null;
    }

    public Employee increaseSalary(Employee employee, int newSalarySize) {
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i]!=null){
                if (employees[i].name.equals(employee.name) && employees[i].surname.equals(employee.surname) ){
//                employee.info.;
                }
            }
        }
        return null;
    }

    public int totalSalary() {
        int total = 0;
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i] != null) {
                total += employees[i].info.getSalary();
            }
        }
        return total;
    }
    public Employee[] addByeIndex(Employee employee, int index){
        for (int i = 0; i < employees.length ; i++) {
            if (i == index){
                employees[i] = employee;
            }
        }
        return employees;
    }
}
