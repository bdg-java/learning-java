package com.bdg.lalalulu;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex a) {
        Complex otherNumber = new Complex();
        otherNumber.realPart = this.realPart + a.realPart;
        otherNumber.imaginaryPart = this.imaginaryPart + a.imaginaryPart;
        return otherNumber;
    }

    public Complex subtract(Complex a) {
        Complex otherNumber = new Complex();
        otherNumber.realPart = this.realPart - a.realPart;
        otherNumber.imaginaryPart = this.imaginaryPart - a.imaginaryPart;
        return otherNumber;
    }

    public Complex multiply(Complex a) {
        Complex newNumber = new Complex();
        newNumber.realPart = this.realPart * a.realPart - this.imaginaryPart * a.imaginaryPart;
        newNumber.imaginaryPart = this.realPart * a.imaginaryPart + this.imaginaryPart * a.realPart;
        return newNumber;
    }

    public  Complex divide(Complex a) {
        Complex newNumber = new Complex();
        if (a.realPart != 0 && a.imaginaryPart != 0) {
            newNumber.realPart = this.realPart / a.realPart;
            newNumber.imaginaryPart = this.imaginaryPart / a.imaginaryPart;
            return newNumber;
        }
        return null;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return this.realPart;
    }

    public double getImaginaryPart() {
        return this.imaginaryPart;
    }

    public String toString() {
        return "Complex : "+this.realPart+", "+this.imaginaryPart+"";
    }
}
