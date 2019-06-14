package com.bdg.hrmanagmentTool;


public abstract class Employee extends Person {

     protected SalaryInfo info;
     protected int referenceNumber;

     public Employee(SalaryInfo info, String name, String surname, int age){
         super(name, surname, age);
         this.info = info;
     }
    public abstract Profession profession();

     public void addreferenceNamber(int ref){
         this.referenceNumber = ref;
     }



}