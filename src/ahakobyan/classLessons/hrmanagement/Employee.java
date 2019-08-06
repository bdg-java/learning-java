package ahakobyan.classLessons.hrmanagement;

public abstract class Employee extends Person {

    protected SalaryInfo info;
    protected int referunceNumber;


    public Employee(SalaryInfo info, String name, String surname, int age) {
        super(name, surname, age);
        this.info = info;
    }

    public abstract Profession profession();

    public void addReferenceNumber(int ref) {
        this.referunceNumber = ref;
    }
}
