package com.bdg.agharibyan.datastructuresandalgorithm.objectsort;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String firstName, String secondName, int age){
        this.name = firstName;
        this.surname = secondName;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getAge(){
        return age;
    }

    public void display(){
        System.out.println("Surname: " + surname + ", Name: " + name + ", Age: " + age);
    }
}
