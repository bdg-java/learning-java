package ahakobyan.ClassLessons.inheritance;

public class Person {

    protected String name;
    protected String address;

    public Person () {

    }

    public Person(String name, String address) {
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name = Petros, address = Yerevan]";
    }
}
