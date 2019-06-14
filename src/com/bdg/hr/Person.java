package com.bdg.hr;

public abstract class Person {

    protected String name;
    protected String surname;
    protected int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean equal(Object name) {
        if (name == this) {
            return true;
        }
        Person that = (Person) name;
        return that.name.equals(this.name);
    }
}
