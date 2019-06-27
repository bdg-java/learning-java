package com.bdg.Exception;

public class MyClassnew {
   static void checkAge(int age) {
        if (age < 18) {
            throw new YourOldExceaption("15");

        } else {
            System.out.println("You are old enougth");
        }
    }

    public static void main(String[] args) {


        checkAge(14);
    }
}
