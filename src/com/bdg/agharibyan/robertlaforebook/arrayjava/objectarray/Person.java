package com.bdg.agharibyan.robertlaforebook.arrayjava.objectarray;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String name, String surname, int age){
        this.firstName = name;
        this.lastName = surname;
        this.age = age;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void displayPerson(){
        System.out.print("firstname " + firstName + ", lastname " + lastName + ", age " + age);
        System.out.println();
    }
}
