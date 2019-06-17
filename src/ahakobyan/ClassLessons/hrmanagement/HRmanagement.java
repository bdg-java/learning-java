package ahakobyan.ClassLessons.hrmanagement;

public class HRmanagement {

    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;
    private int currentIndex = 0;

    public HRmanagement(int intialSize) {
        this.employees = new Employee[intialSize];
    }

    public HRmanagement() {
        this(DEFAULT_CONTAINER_SIZE);
    }
    public boolean addEmployee(Employee employee) {
        if(employees.length == currentIndex) {
            this.increaseSize();
        }
        this.employees[currentIndex] = employee;
        currentIndex++;
        return true;
    }

    private void increaseSize() {
        Employee[] newSize = new Employee[this.employees.length + this.employees.length / 2];
        System.arraycopy(this.employees, 0, newSize, 0, this.employees.length);
        this.employees = newSize;
    }

    public Employee[] findByProfession(Profession profession) {
        Employee[] prof = new Employee[this.currentIndex];
        int a = 0;
        for (Employee employee : this.employees)
            if (employee.profession().name().equals(profession)) {
                prof[a] = employee;
                a++;
            }
        if (a > 0) {
            Employee[] prof1 = new Employee[a];
            for (int i = 0; i < a  ; i++) {
                prof1[i] = prof[i];
            }
            return prof1;
        }
        return prof;
    }

    public Employee[] removeEmployee(Employee employee) {
        Employee[] rememp = new Employee[currentIndex - 1];
        for (int i = 0; i <employees.length ; i++) {
            if (!employees[i].equals(employee)) {
                if (employees[i] != null) {
                    rememp = employees;
                }
            }
        }
        return rememp;
    }

    public Employee[] removeByName(String name) {
        Employee[] employee = findByName(name);
            for (Employee emp : this.employees) {
                removeEmployee(emp);
            }
        return this.employees;
    }

    public Employee[] removeByNames(String... names) {
        Employee[] remname1 = new Employee[currentIndex -1];
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i].name.equals(names)) {
                employees[i] = null;
            }
        }
        return employees;
    }

    public Employee[] removeWithSalaryRange(int from, int to) {
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].info.getSalary() > from && employees[i].info.getSalary() < to) {
                    employees[i] = null;
            }
        }
        return employees;
    }

    public boolean contains(Employee employee) {
        boolean b = false;
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].name.equals(employee.name) && employees[i].surname.equals(employee.surname)) {
                b = true;
            }
        }
        return b;
    }

    public Employee[] findByName(String employeeName) {
        Employee[] findname = new Employee[currentIndex];
         int c = 0;
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].name.equals(employeeName)) {
                c = i;
            }
        }
        return findname;
    }

    public Employee findByCardNumber(String cardNumber) {
        for (Employee employee : this.employees) {
            if (employees != null) {
                if (employee.info.getCardNumber() == cardNumber) {
                    return employee;
                }
            }
        }
        return null;
    }

    public int findEmployeeWithSalaryRange(int from, int to) {
        int a = 0;
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] != null) {
                if (employees[i].info.getSalary() > from && employees[i].info.getSalary() < to) {
                    a++;
                }
            }
        }
        return a;
    }

    public Employee increaseSalary(Employee employee, int newSalary) {
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] != null) {
                if (employees[i].name.equals(employee.name) && employees[i].surname.equals(employee.surname)) {
                    new SalaryInfo(employees[i].info.getCardNumber(), newSalary);
                }
            }
        }
        return null;
    }

    public int totalSalary() {
        int total = 0;
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] != null) {
                total = total + employees[i].info.getSalary();
            }
        }
        return total;
    }
}
