package com.bdg.hrmanagmentTool;

public abstract class Person {
     protected String name;
     protected String surname;
     protected int age;

     Person(String name, String surname, int age){
         this.name = name;
         this.surname = surname;
         this.age = age;
     }
}
