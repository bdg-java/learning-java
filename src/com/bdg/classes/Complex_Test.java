package com.bdg.classes;

public class Complex_Test {
    public static void main(String[] args) {
        Complex complex = new Complex(4.5,12.4);
        Complex a = new Complex(12.4,12);
        System.out.println(complex.toString());
        System.out.println(complex.add(a));
    }

}
