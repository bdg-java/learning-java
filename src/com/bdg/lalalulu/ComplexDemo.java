package com.bdg.lalalulu;

public class ComplexDemo {
    public static void main(String[] args) {

        Complex complex = new Complex(7,8);
        Complex newComlex = new Complex(5,9);

        System.out.println(complex.add(complex));
        System.out.println(complex.subtract(newComlex));
    }
}
