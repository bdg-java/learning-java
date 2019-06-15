package com.bdg.PersonAndSubclasses;

public class Person {
    protected String name;
    protected String address;

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

    public String toString() {
        return "Person [" + this.name + " , " + this.address + " ]";
    }
}

