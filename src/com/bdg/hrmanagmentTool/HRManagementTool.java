package com.bdg.hrmanagmentTool;

public class HRManagementTool {
    private Employee [] employees;
    public static final int DEFAULT_CONTAINER_SIZE = 10;

    private int currentIndex = 0;
    protected int referenceNumber;

    public HRManagementTool(int initialSize){
        this.employees = new Employee[initialSize];
    }

    public HRManagementTool(){
        this(DEFAULT_CONTAINER_SIZE);
    }

    public boolean addEmployee (Employee employee){
        if (employees.length == currentIndex) {
            this.increaseSize();
        }
      this.employees[currentIndex] = employee;
        currentIndex++;
        return true;
    }

    public void increaseSize(){

        Employee[] newArray =  new Employee[employees.length + employees.length/2];
//        for(int i = 0; i< employees.length; i++){
//            newArray[i] = this.employees[i];
//        }

        System.arraycopy(this.employees, 0, newArray, 0, this.employees.length);
        this.employees = newArray;
    }


    public Employee[] findByProfession(Profession profession){
        Employee [] foundProf = new Employee[this.currentIndex];
        int k = 0;
        for(Employee employee: this.employees){
             if(employee.profession().equals(profession)){
                 foundProf[k] = employees[k];
                 k++;
             }
        }

        if(k > 0){
            Employee [] foundProf2 = new Employee[k];
            for(int i = 0; i< k; i++){
                foundProf2[i] = foundProf[i];
            }
            return foundProf2;
        }

        return null;
    }


    public boolean removeEmployee(Employee employee) {
        //implement this
        Employee[] empArray = new Employee[currentIndex];
        if(currentIndex < 1  || this.employees == null){
            return false;
        }
        this.employees[currentIndex] = employee;
        currentIndex--;
        return true;
    }

    public Employee[] removeEmployee1(Employee employee) {
        //implement this
        Employee[] empArray = new Employee[currentIndex];
        if(currentIndex < 1  || this.employees == null){
            return null;
        }
        this.employees[currentIndex] = employee;
        currentIndex--;
        return this.employees;
    }

    public Employee[] removeByName(String name) {

        Employee[] nameRemove = new Employee[currentIndex];
        for(Employee employee: employees){
            if(employee.name == name){
               this.employees = null;
            }
        }

        return this.employees;
    }


    public Employee[] removeByNames(String... names) {
        Employee[] namesRemove = new Employee[currentIndex];
        for(Employee employee: employees){
            int k = 0;
            if(employees[k].name == namesRemove[k].name){
                   this.employees = null;
               }
//            for(int i = 0 ; i < currentIndex; i++ ){
//                if(employees[i].name == namesRemove[i].name){
//                    this.employees = null;
//                }
//            }

        }

        return this.employees;
    }

    public Employee[] removeWithSalaryRange(int from, int to) {
               Employee [] empSalaryRange = new Employee[currentIndex];
               for (int i = 0; i < employees.length; i++) {
                   if(employees[i].info.getSalary() > to && employees[i].info.getSalary() < from){
                       this.employees = null;
                   }
        }
        return this.employees;
    }

    public boolean contains(Employee employee) {
        Employee[] array = new Employee[currentIndex];
        for(Employee emp: employees){
            if((emp.name).equals(employee) && (emp.surname).equals(employee) ){
                return true;
            }
        }

        return false;

    }

    public Employee[] findByName(String employeeName) {
       Employee[] array = new Employee[currentIndex];
       for(Employee employee: employees){
           if(employee.name.equals(employeeName) && employee.name != null){
               return this.employees;
           }
       }
        return null;
    }

    public Employee findByCardNumber(String cardNumber) {

        for(int i = 0; i< currentIndex; i++){
            if(employees[i].info.getCardNumber().equals(cardNumber) && (employees[i].info.getCardNumber() != null)){
                return employees[i];
            }
        }
        return null;
    }

    public Employee[] findEmployeeWithSalaryRange(int from, int to) {

        for(Employee employee: employees){
            if(employee.info.getSalary() > from && employee.info.getSalary() < to){
                return this.employees;
            }
        }
        return null;
    }

    public Employee increaseSalary(Employee employee, int newSalarySize) {;


        for (int i = 0; i <currentIndex; i++){
            if(employees[i].equals(employee)){
                int salary = employees[i].info.getSalary();
                salary = this.employees[i].info.getSalary()*2 ;
            }
        }
        return null;
    }

    public int totalSalary() {
        int total = 0;
       for(int i = 0; i<currentIndex; i++){
           total += employees[i].info.getSalary();
           return total;
       }
        return -1;
    }
}
