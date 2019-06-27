package com.bdg.Exception;

public class MyClass {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("You are %s, it is not enogth old");
        } else {
            System.out.println("You are old enougth");
        }
    }

    public static void main(String[] args) {
        checkAge(14);
    }
}
