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
        currentEmployeeCount ++;
        return true;
    }

    private void resize() {
        Employee[] resizedEmployee = new Employee[this.employees.length + this.employees.length / 2]; //mecacnum enq 0.5 angam
//        int k = 0;
//        for (Employee employee : this.employees) {
//            resizedEmployee[k] = employee;
//            k++;
//        }
        System.arraycopy(this.employees, 0, resizedEmployee, 0, currentEmployeeCount);
        this.employees = resizedEmployee;
    }

    public Employee[] findByProfession(Profession profession) {
        Employee[] employeesSearchByProfession = new Employee[currentEmployeeCount];
        int k = 0;
        for (Employee employee : this.employees) {
            if (employee != null && employee.profession().equals(profession)) {
                employeesSearchByProfession[k] = employee;
                k++;
            }
        }
        if (k > 0) {
            Employee[] employeesFoundByProfession = new Employee[k];
            for (int i = 0; i < k; i++) {
                employeesFoundByProfession[i] = employeesSearchByProfession[i];
            }
            return employeesFoundByProfession;
        }
        return null;
    }
// William jan,chisht em, vor petq e stugem null e, te voch findByProffesionum?
// Dasin indz tvac dra kariqy chka, qani vor mi pah aseci grenq ifi mej nullin havasar chi, aseciq ed el a tarberak.
// Bayc hima inchpes khusapem null chlinelu stugumic chgitem.

    public Employee[] removeEmployee(Employee employee) {
        int removedEmployeeIndex = 0;
        for (int i = 0; i < currentEmployeeCount; i++) {
            if (this.employees[i].referenceNumber == employee.referenceNumber) {
                removedEmployeeIndex = i;
            }
        }
        Employee[] arrayAfterRemoveEmployee = new Employee[currentEmployeeCount-1];
        System.arraycopy(this.employees, 0, arrayAfterRemoveEmployee, 0, removedEmployeeIndex);
        System.arraycopy(this.employees, removedEmployeeIndex+1, arrayAfterRemoveEmployee, removedEmployeeIndex, currentEmployeeCount - removedEmployeeIndex - 1);
        this.employees = arrayAfterRemoveEmployee;
        return arrayAfterRemoveEmployee;
    }
//erb e methodi kanchelu zhamanak fielderi mi masy erevum, mi masy che? orinak system.arraycopy 2rdum destPos: chi grvum
//chisht em haskanum, vor removeemployeei zhamanak referenceNumbery chenq 0acnum, vorpeszi ete het yndunenq nuyny tramadrenq iren

    public Employee[] removeByName(String name){

        int employeesNewSize = 0;
        Employee[] employeeRemoveByName = new Employee[employees.length];
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null && employees[i].name != (name)){
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
