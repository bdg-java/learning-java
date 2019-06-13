package com.bdg.agharibyan.hrmanagementtoolhomework;

public class HRManagementTool {

    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;

    private int currentEmployeeCount;

    public HRManagementTool(int initialSize) {
        this.employees = new Employee[initialSize];
        this.currentEmployeeCount = 0;
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
        Employee[] resizedEmployee = new Employee[this.employees.length + this.employees.length / 2]; //mecacnum enq 0.5 angam
        int k = 0;
//        for (Employee employee : this.employees) {
//            resizedEmployee[k] = employee;
//            k++;
//        }
        System.arraycopy(this.employees, 0, resizedEmployee, 0, currentEmployeeCount);
        this.employees = resizedEmployee;
    }

    public Employee[] findByProfession(Profession profession){
        Employee[] employeesSearchByProfession = new Employee[currentEmployeeCount];
        int k = 0;
        for(Employee employee: this.employees){
            if(employee != null && employee.profession().name().equals(profession.name())){
                employeesSearchByProfession[k] = employee;
                k ++;
            }
        }
        if(k > 0) {
            Employee[] employeesFoundByProfession = new Employee[k];
            for(int i = 0; i < k; i++){
                employeesFoundByProfession[i] = employeesSearchByProfession[i];
            }
            return employeesFoundByProfession;
        }
        return null;
    }

    public boolean removeEmployee(Employee employee){
        Employee[] employeeRemoved = new Employee[currentEmployeeCount];
        int k = 0;
        for(Employee removedemployee: this.employees){
            if(removedemployee != null && removedemployee.referenceNumber != employee.referenceNumber){
                employeeRemoved[k] = removedemployee;
                k++;
            }
        }
        if(k > 0){
            Employee [] employeesAfterRemovingEmployee = new Employee[currentEmployeeCount - k];
            for(int i = 0; i < k; i++){



            }
            return true;
        }
//        int employeesNewSize = 0;
//        for(int i = 0; i < employees.length; i++){
//            if(employees[i] != null && employees[i] != employee){
//                employeeRemove[employeesNewSize] = employee;
//                 employeesNewSize ++;
//            }
//        }
//        employees[this.currentEmployeeCount] = employeeRemove[employeesNewSize];
        return false;
    }

    public Employee[] removeByName(String name){
        int employeesNewSize = 0;
        Employee[] employeeRemoveByName = new Employee[employees.length];
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null && !employees[i].name.equals(name)){
                employeeRemoveByName[employeesNewSize] = employees[i];
                employeesNewSize ++;
            }
        }
        return employeeRemoveByName;
    }


    public Employee[] removeByNames(String name1, String name2, String nameN){
        int currentEmployeeCount = 0;
        Employee[] employeesRemoveByNames = new Employee[employees.length];
        for(int i = 0; i < employees.length; i++){
            if(employees[i]!= null && !employees[i].name.equals(name1) && !employees[i].name.equals(name2) && !employees[i].name.equals(nameN)){
                employeesRemoveByNames[currentEmployeeCount] = employees[i];
                currentEmployeeCount ++;
            }
        }
        return employeesRemoveByNames;
    }

    public Employee [] removeWithSalaryRange(int from, int to){
        int currentEmployeeCount = 0;
        Employee[] employeesRemoveWithSalaryRange = new Employee[employees.length];
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null && employees[i].getSalaryInfo().getSalary() < from || employees[i]!= null && employees[i].getSalaryInfo().getSalary() > to){
                employeesRemoveWithSalaryRange[currentEmployeeCount] = employees[i];
                currentEmployeeCount++;
            }
        }
        return employeesRemoveWithSalaryRange;
    }

    public boolean contains(Employee employee){
        int currentEmployeeCount = 0;
        Employee[] employeesWithSameNameSurname = new Employee[employees.length];
        for(int i = 0;  i < employees.length; i++){
            if(employees[i] != null && employees[i].name.equals(employee.name) && employees[i].surname.equals(employee.surname)){
                employees[currentEmployeeCount] = employee;
                currentEmployeeCount++;
            }
        }
        return true;
    }

    public Employee [] findByName(String employeeName){
        int currentEmployeeCount = 0;
        Employee[] employeesFindByName = new Employee[employees.length];
        for(int i = 0; i < employees.length; i++){
            if(employees[i]!= null && employees[i].name.equals(employeeName)){
                employeesFindByName[currentEmployeeCount] = employees[i];
                currentEmployeeCount++;
            }
        }
        return employeesFindByName;
    }

    public int totalSalary() {
        int salaryTotal = 0;
        for(int i = 0; i < employees.length; i++){
           if(employees[i] != null) {
               salaryTotal += employees[i].getSalaryInfo().getSalary();
           }
        }
        return salaryTotal;
    }

}
