package com.bdg.agharibyan.classesobjecteshomework.question3;

public class ComplexDemo {
    public static void main(String[] args) {

        Complex complexDemo = new Complex(15.0, 2.0);
        Complex otherComplex = new Complex (10.0, 8.0);

        System.out.println("Default Complex's real part:" + complexDemo.getRealPart());
        System.out.println("Default Complex's imaginary part:" + complexDemo.getImaginaryPart());
        System.out.println("Other Complex's real part:" + otherComplex.getRealPart());
        System.out.println("Other Complex's imaginary part:" + otherComplex.getImaginaryPart());
        System.out.println("New Complex after adding:" + complexDemo.add(otherComplex));
        System.out.println("New Complex after subtracting:" + complexDemo.subtract(otherComplex));
        System.out.println("New Complex after multiplying:" + complexDemo.multiply(otherComplex));
        System.out.println("New Complex after dividing:" + complexDemo.divide(otherComplex));
        System.out.println("Default Complex:" + complexDemo.toString());
        complexDemo.setRealPart(1000.0);
        complexDemo.setImaginaryPart(60.0);
        System.out.println("Complex after setting:" + complexDemo.toString());
    }
}
