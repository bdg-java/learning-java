package ahakobyan.classLessons.hrmanagement;

public abstract class Person {

    protected String name;
    protected String surname;
    protected int age;

    public Person() {

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
