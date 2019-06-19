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
        if(employee != null) {
            this.employees[this.currentEmployeeCount] = employee;
            currentEmployeeCount++;
        }
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
        int z = 0;
        for (int k = 0; k < currentEmployeeCount; k++) {
            if (this.employees[k].profession().equals(profession)) {
                employeesSearchByProfession[z] = this.employees[k];
                z++;
            }
        }
        if (z > 0) {
            Employee[] employeesFoundByProfession = new Employee[z];
            for (int i = 0; i < z; i++) {
                    employeesFoundByProfession[i] = employeesSearchByProfession[i];
            }
            return employeesFoundByProfession;
        }
        return null;
    }

    public Employee[] removeEmployee(Employee employee) {
        int removedEmployeeIndex = 0;
        for (int i = 0; i < currentEmployeeCount; i++) {
            if (this.employees[i].referenceNumber == employee.referenceNumber) {
                removedEmployeeIndex = i;
            }
        }
        Employee[] arrayAfterRemoveEmployee = new Employee[currentEmployeeCount - 1];
        System.arraycopy(this.employees, 0, arrayAfterRemoveEmployee, 0, removedEmployeeIndex);
        System.arraycopy(this.employees, removedEmployeeIndex + 1, arrayAfterRemoveEmployee, removedEmployeeIndex, currentEmployeeCount - removedEmployeeIndex - 1);
        this.employees = arrayAfterRemoveEmployee;
        currentEmployeeCount = arrayAfterRemoveEmployee.length;
        return arrayAfterRemoveEmployee;
    }

    public Employee[] removeByName(String name) {
        Employee[] employeesSearchByName = new Employee[currentEmployeeCount];
        int z = 0;
        for (int i = 0; i < currentEmployeeCount; i++) {
            if (!this.employees[i].name.equals(name)) {
                employeesSearchByName[z] = this.employees[i];
                z++;
            }
        }
        if(z > 0){
            Employee[] employeesAfterRemovedByName = new Employee[z];
            for(int k = 0; k < z; k++){
                employeesAfterRemovedByName[k] = employeesSearchByName[k];
            }
            this.employees = employeesAfterRemovedByName;
            currentEmployeeCount = employeesAfterRemovedByName.length;
            return employeesAfterRemovedByName;
        }
        return null;
    }

    public Employee[] removeByNames(String... names) {
        Employee[] removed = new Employee[this.currentEmployeeCount];
        int k = 0;
        for (String name : names) {
            Employee[] employees = removeByName(name);
            for (Employee employee : employees) {
                removed[k] = employee;
                k++;
            }
        }
        return removed;
    }

    public Employee[] removeWithSalaryRange(int from, int to) {
        Employee[] searchEmployeesWithSalaryRange = new Employee[currentEmployeeCount];
        int z = 0;
        for(int i = 0; i < currentEmployeeCount; i++){
            if(employees[i].getSalaryInfo().getSalary() < from || employees[i].getSalaryInfo().getSalary() > to){
                searchEmployeesWithSalaryRange[z] = this.employees[i];
                z++;
            }
        }
        if(z > 0){
            Employee[] employeesAfterRemovedWithSalaryRange = new Employee[z];
            for(int k = 0; k < z; k ++) {
                employeesAfterRemovedWithSalaryRange[k] = searchEmployeesWithSalaryRange[k];
            }
            this.employees = employeesAfterRemovedWithSalaryRange;
            currentEmployeeCount = employeesAfterRemovedWithSalaryRange.length;
            return  employeesAfterRemovedWithSalaryRange;
        }
        return null;
    }

    public boolean contains(Employee employee) {
        for (int i = 0; i < currentEmployeeCount; i++) {
            if (employees[i].name.equals(employee.name) && employees[i].surname.equals(employee.surname)) {
                return true;
            }
        }
        return false;
    }

    public Employee[] findByName(String employeeName) {
        Employee[] employeesFindByNameWithNull = new Employee[currentEmployeeCount];
        int z = 0;
        for (int i = 0; i < currentEmployeeCount; i++) {
            if (this.employees[i].name.equals(employeeName)) {
                employeesFindByNameWithNull[z] = this.employees[i];
                z++;
            }
        }
        if (z > 0) {
            Employee[] employeesFindByName = new Employee[z];
            for (int k = 0; k < z; k++){
                employeesFindByName[k] = employeesFindByNameWithNull[k];
            }
            return employeesFindByName;
        }
        return null;
    }

    public Employee findByCardNumber(String cardNumber) {
        for (int i = 0; i < currentEmployeeCount; i++) {
            if (this.employees[i].info.getCardNumber().equals(cardNumber)) {
                return this.employees[i];
            }
        }
        return null;
    }

    public Employee[] findEmployeeWithSalaryRange(int from, int to){
        Employee[] employeesFindEmployeeWithSalaryRangeWithNull = new Employee[currentEmployeeCount];
        int z = 0;
        for(int i = 0; i < currentEmployeeCount; i++){
            if(this.employees[i].getSalaryInfo().getSalary() > from && this.employees[i].getSalaryInfo().getSalary() < to){
                employeesFindEmployeeWithSalaryRangeWithNull[z] = this.employees[i];
                z++;
            }
        }
        if(z > 0){
            Employee [] employeesFindEmployeeWithSalaryRange = new Employee[z];
            for(int k = 0; k < z; k++) {
                employeesFindEmployeeWithSalaryRange[k] = employeesFindEmployeeWithSalaryRangeWithNull[k];
            }
            return employeesFindEmployeeWithSalaryRange;
        }
        return null;
    }

    public Employee increaseSalary(Employee employee, int newSalarySize){
        for(int i = 0; i < currentEmployeeCount; i++){
            if(this.employees[i].referenceNumber == employee.referenceNumber && newSalarySize > this.employees[i].getSalaryInfo().getSalary()){
                this.employees[i].getSalaryInfo().setSalary(newSalarySize);
                return this.employees[i];
            }
        }
        return null;
    }

    public int totalSalary() {
        int salaryTotal = 0;
        for (int i = 0; i < currentEmployeeCount; i++) {
            salaryTotal += employees[i].getSalaryInfo().getSalary();
        }
        return salaryTotal;
    }

    public static void main(String[] args) {
        new HRManagementTool().removeByNames("anna", "karen");
    }
}

