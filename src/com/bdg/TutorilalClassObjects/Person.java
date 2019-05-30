package com.bdg.TutorilalClassObjects;

public class Person {
    String Name = "Jhon";
    String LastName = "Doe";
    int Age = 24;

    public static void main(String[] args) {
        Person MyObjc = new Person();
        System.out.println("name:"+ " " + MyObjc.Name +""+ MyObjc.LastName);
        System.out.println("age:"+" "+MyObjc.Age);
    }
}
