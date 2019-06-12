package com.classwork8;

public class ComplexDemo {
    public static void main(String[] args) {

        Complex c1 = new Complex();
        System.out.println(c1);
        c1.setRealPart(5);
        c1.setImaginaryPart(6);
        System.out.println(c1);
        Complex c2 = new Complex(2, 3);
        Complex c3 = c1.Add(c2);
        Complex c4 = c1.Subtract(c2);
        Complex c5 = c1.Multiply(c2);
        Complex c6 = c1.Divide(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

    }
}
