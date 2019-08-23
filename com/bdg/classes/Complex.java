package com.bdg.classes;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public Complex(){
        realPart = 0;
        imaginaryPart  = 0;

    }
    public Complex(double realPart,double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex otherNumber){
        Complex another = new Complex();
        another.realPart = this.realPart + otherNumber.realPart;
        another.imaginaryPart = this.imaginaryPart + otherNumber.imaginaryPart;
        return another;
    }
    public Complex subtract(Complex otherNumber){
        Complex another = new Complex();
        another.realPart = this.realPart - otherNumber.realPart;
        another.imaginaryPart = this.imaginaryPart - otherNumber.imaginaryPart;
        return another;
    }
    public Complex multiply(Complex otherNumber){
        Complex another = new Complex();
        another.realPart = this.realPart * otherNumber.realPart;
        another.imaginaryPart = this.imaginaryPart * otherNumber.imaginaryPart;
        return another;
    }
    public Complex divide(Complex otherNumber){
        Complex another = new Complex();
        another.realPart = (double) this.realPart / otherNumber.realPart;
        another.imaginaryPart = (double)this.imaginaryPart / otherNumber.imaginaryPart;
        return another;
    }

    @Override
    public String toString() {
        return "Complex{" + "realPart=" + realPart + ", imaginaryPart=" + imaginaryPart + '}';
    }
}
