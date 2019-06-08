package com.bdg.agharibyan.classesobjecteshomework.question3;

public class Complex {

    double realPart;
    double imaginaryPart;

    public Complex(){
        realPart = 0.0;
        imaginaryPart = 0.0;
    }

    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex otherNumber){
        Complex newComplex = new Complex();
        newComplex.realPart = this.realPart + otherNumber.realPart;
        newComplex.imaginaryPart = this.imaginaryPart + otherNumber.imaginaryPart;
        return newComplex;
    }

    public Complex subtract(Complex otherNumber){
        Complex newComplex = new Complex();
        newComplex.realPart = this.realPart - otherNumber.realPart;
        newComplex.imaginaryPart = this.imaginaryPart - otherNumber.imaginaryPart;
        return newComplex;
    }

    public Complex multiply(Complex otherNumber){
        Complex newComplex = new Complex();
        newComplex.realPart = this.realPart * otherNumber.realPart;
        newComplex.imaginaryPart = this.imaginaryPart * otherNumber. realPart;
        return newComplex;
    }

    public Complex divide(Complex otherNumber){
        Complex newComplex = new Complex();
        newComplex.realPart = this.realPart / otherNumber.realPart;
        newComplex.imaginaryPart = this.imaginaryPart / otherNumber.imaginaryPart;
        return newComplex;
    }

    public void setRealPart(double realPart){
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart){
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart(){
        return realPart;
    }

    public double getImaginaryPart(){
        return imaginaryPart;
    }

    public String toString(){
        return "Complex:["+ this.realPart +","+ this.imaginaryPart +"]";
    }
}
