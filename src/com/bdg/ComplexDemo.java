package com.bdg;

public class ComplexDemo {
    public static void main(String[] args) {
        Complex realComplex = new Complex(10,7);
        System.out.println(realComplex.Add(realComplex));
        System.out.println(realComplex.subtrackt(realComplex));
        System.out.println(realComplex.multiply(realComplex));
        System.out.println(realComplex.divid(realComplex));
    }
}
