package com.lesson8;

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

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public Complex Add(Complex b) {
        Complex c = new Complex();
        c.realPart = this.realPart + b.realPart;
        c.imaginaryPart = this.imaginaryPart + b.imaginaryPart;
        return c;
    }

    public Complex Subtract(Complex b) {
        Complex c = new Complex();
        c.realPart = this.realPart - b.realPart;
        c.imaginaryPart = this.imaginaryPart - b.imaginaryPart;
        return c;
    }

    public Complex Multiply(Complex b) {
        Complex c = new Complex();
        c.realPart = this.realPart * b.realPart - this.imaginaryPart * b.imaginaryPart;
        c.imaginaryPart = this.realPart * b.imaginaryPart + this.imaginaryPart * b.realPart;
        return c;
    }

    public Complex Divide(Complex b) {
        Complex c = new Complex();
        double devider = b.realPart * b.realPart + b.imaginaryPart * b.imaginaryPart;
        c.realPart = (this.realPart * b.realPart + this.imaginaryPart * b.imaginaryPart) / devider;
        c.imaginaryPart = (b.realPart * this.imaginaryPart - this.realPart * b.imaginaryPart) / devider;
        return c;
    }

    public String toString() {
        return "Complex : [ " + this.realPart + " + i" + this.imaginaryPart + " ]";
    }
}
