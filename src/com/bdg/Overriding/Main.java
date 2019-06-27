package com.bdg.Overriding;


import static com.bdg.Overriding.Emploee.base;

public class Main {
    static void printSalary(Emploee e){
        System.out.println(e.Salary());
    }
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show();
        obj1.hide();

        Parent obj2 = new Child();
        obj2.show();
        obj2.hide();

        System.out.println(base);


        Emploee objj = new Maneger();
        System.out.println("Manager Salary :");
        printSalary(objj);

        Emploee objj1 = new Clerk();
        System.out.println("Clerck Salary:");
        printSalary(objj1);
    }
}
