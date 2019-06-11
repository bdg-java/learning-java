package com.bdg;

public final class Employee {

    private final String name;
    private final ImmutableAddress address;

    private static final int age;

    public static final Address addr = new Address();
    static {
        age = 45;
    }

    public Employee(String name, Address address) {
        this.name = name;
        this.address = new ImmutableAddress(address);
    }

    public String name() {
        return this.name;
    }

    public ImmutableAddress employeeAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
