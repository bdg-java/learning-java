package com.bdg.classlessons;

public class ComplexDemo {
    public static void main(String[] args) {
        Complex complex = new Complex(2,4);
        Complex complexNew = new Complex(4,45);
        System.out.println(complex.add(complexNew));
        System.out.println(complex.subtract(complexNew));
    }
}
