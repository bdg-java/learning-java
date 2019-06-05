package com.bdg;

public class Complex {
    double realPart ;
    double imaginaryPart ;

    public Complex(){
       realPart = 0;
       imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public Complex Add (Complex sum){
            Complex otherNumber = new Complex();
        if(realPart>0 && imaginaryPart>0) {
            otherNumber.realPart = this.realPart + sum.realPart;
            otherNumber.imaginaryPart = this.imaginaryPart + sum.imaginaryPart;
        }else{
            otherNumber.realPart = 0.0;
            otherNumber.imaginaryPart = 0.0;
        }

            return otherNumber;

    }

    public Complex subtrackt (Complex minus){
        Complex otherNumber = new Complex();
        if(realPart>0 && imaginaryPart>0 && this.realPart >= minus.realPart && this.imaginaryPart>= minus.imaginaryPart) {
            otherNumber.realPart = this.realPart - minus.realPart;
            otherNumber.imaginaryPart = this.imaginaryPart - minus.imaginaryPart;
        }else{
            otherNumber.realPart = 0.0;
            otherNumber.imaginaryPart = 0.0;
        }
        return otherNumber;

    }


    public Complex multiply (Complex EvenOnce){
        Complex otherNumber = new Complex();
        if(realPart>0 && imaginaryPart>0) {
            otherNumber.realPart = this.realPart * EvenOnce.realPart;
            otherNumber.imaginaryPart = this.imaginaryPart * EvenOnce.imaginaryPart;
        }else{
            otherNumber.realPart = 0.0;
            otherNumber.imaginaryPart = 0.0;
        }
        return otherNumber;

    }

    public Complex divid (Complex minus){
        Complex otherNumber = new Complex();
        if(realPart>0 && imaginaryPart>0 && this.realPart >= minus.realPart && this.imaginaryPart>= minus.imaginaryPart) {
            otherNumber.realPart = this.realPart / minus.realPart;
            otherNumber.imaginaryPart = this.imaginaryPart / minus.imaginaryPart;
        }else{
            otherNumber.realPart = 0.0;
            otherNumber.imaginaryPart = 0.0;
        }
        return otherNumber;

    }


    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    @Override
    public String toString() {
        return "Complex : " + this.realPart + ", " + this.imaginaryPart + "";
    }
}
