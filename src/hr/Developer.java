package hr;

public class Developer extends Employee {

    private final Profession profession = new Profession("Developer");

    public Developer(SalaryInfo info, String name, String surname, int age) {
        super(info, name, surname, age);
    }

    @Override
    public Profession profession() {
        return this.profession;
    }

}

