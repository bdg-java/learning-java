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

    public String toString(){
        return "name: "+ name + " surname: "+ surname+ " age: "+ age;
    }
}
