package hr;


public class HRManagementTool {

    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;
    private int currentIndex = 0;
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
    public void increaseSize(){

        Employee[] newArray =  new Employee[employees.length + employees.length/2];
//        for(int i = 0; i< employees.length; i++){
//            newArray[i] = this.employees[i];
//        }
        System.arraycopy(this.employees, 0, newArray, 0, this.employees.length);
        this.employees = newArray;
    }
    public Employee[] findByProfession(Profession profession) {
            Employee [] p = new Employee[this.currentIndex];
            int n = 0;
            for(Employee employee: this.employees){
                if(employee.profession().equals(profession)){
                    p[n] = employees[n];
                    n++;
                }
            }
            if(n > 0){
                Employee [] p2 = new Employee[n];
                for(int i = 0; i< n; i++){
                    p2[i] = p[i];
                }
                return p2;
            }
        return null;
    }
    public boolean removeEmployee(Employee employee) {
            Employee[] employeeArray = new Employee[currentIndex];
            if(currentIndex < 1  || this.employees == null){
                return false;
    }
        this.employees[currentIndex] = employee;
        currentIndex--;
        return true;
    }

    public Employee[] removeByName(String name) {
        Employee[] employeeArray = new Employee[currentIndex -1];
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i].name.equals(name)) {
                employees[i] = null;
            }
        }
        return employees;
    }

    public Employee[] removeByNames(String... names) {
        Employee[] emplArray = new Employee[currentIndex - 1];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].name.equals(names)) {
                employees[i] = null;
            }
        }
            return employees;
        }
    public Employee[] removeWithSalaryRange(int from, int to) {
        Employee [] salaryRange = new Employee[currentIndex];
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
        Employee[] card = new Employee[currentIndex];
        int a = 0;
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].info.getCardNumber().equals(cardNumber)) {
                a = i;
            }
        }
        return employees[a];
    }

    public Employee[] findEmployeeWithSalaryRange(int from, int to) {
        for(Employee employee: employees){
            if(employee.info.getSalary() > from && employee.info.getSalary() < to){
                return this.employees;
            }
        }
        return null;
    }
    public Employee increaseSalary(Employee employee, int newSalarySize) {
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].equals(employee)) {
                new SalaryInfo(employees[i].info.getCardNumber(), newSalarySize);
            }
        }
        return null;
    }
    public int totalSalary() {
        int total = 0;
        for(int i = 0; i < currentIndex; i++){
            total += employees[i].info.getSalary();
            return total;
        }
        return -1;
    }
}
