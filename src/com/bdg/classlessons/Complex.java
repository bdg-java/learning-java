package com.bdg.classlessons;

public class Complex {

    private double realPart;
    private double imaginaryPart;
    public Complex(){
        realPart =0;
        imaginaryPart =0;
    }
    public Complex(double realPart,double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

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

    public Complex add(Complex otherNumber){

        double realPartNew = this.realPart + otherNumber.realPart;
        double imaginaryPartNew = this.imaginaryPart + otherNumber.imaginaryPart;
        return  new Complex(realPartNew,imaginaryPartNew);
    }
    public Complex subtract(Complex otherNumber){
        double realPartNew = this.realPart - otherNumber.realPart;
       double imaginaryPartNew = this.imaginaryPart - otherNumber.imaginaryPart;
        return  new Complex(realPartNew,imaginaryPartNew);
    }
    public Complex multiply(Complex otherNumber){
        double realPartNew = this.realPart * otherNumber.realPart;
        double imaginaryPartNew = this.imaginaryPart * otherNumber.imaginaryPart;
        return  new Complex(realPartNew,imaginaryPartNew);
    }

    public Complex divide(Complex otherNumber){
        if(otherNumber.realPart != 0 && otherNumber.imaginaryPart != 0){
            double realPartNew = this.realPart/otherNumber.realPart;
            double imaginaryPartNew = this.imaginaryPart/otherNumber.imaginaryPart;
            return  new Complex(realPartNew,imaginaryPartNew);
        }
        return null;

    }

    public String  toString(){
        return "realPart: "+ realPart +" imaginaryPart: "+imaginaryPart;
    }



}
