package classlessons;

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
    public Complex add (Complex Number) {
        Complex otherNumber = new Complex();
        otherNumber.realPart = this.realPart + Number.realPart;
        otherNumber.imaginaryPart = this.imaginaryPart + Number.imaginaryPart;
        return otherNumber;
    }
    public Complex subtract (Complex Number) {
        Complex otherNumber = new Complex();
        otherNumber.realPart = this.realPart - Number.realPart;
        otherNumber.imaginaryPart = this.imaginaryPart - Number.imaginaryPart;
        return otherNumber;
    }
    public Complex multiply (Complex Number) {
        Complex otherNumber = new Complex();
        otherNumber.realPart = this.realPart * Number.realPart - this.imaginaryPart * Number.imaginaryPart;
        otherNumber.imaginaryPart = this.realPart * Number.imaginaryPart + this.imaginaryPart * Number.realPart;
        return otherNumber;
    }
    public Complex divide (Complex Number) {
        Complex otherNumber = new Complex();
        if (Number.realPart != 0 && Number.imaginaryPart != 0) {
            otherNumber.realPart = this.realPart / Number.realPart;
            otherNumber.imaginaryPart = this.imaginaryPart / Number.imaginaryPart;
            return otherNumber;
        }
        return null;
    }
    public void setRealPart (double realPart) {
        this.realPart = realPart;
    }
    public void setImaginaryPart (double realPart) {
        this.imaginaryPart = imaginaryPart;
    }
    public double getRealPart() {
        return this.realPart;
    }
    public double getImaginaryPart() {
        return this.imaginaryPart;
    }
    public String toString() {
        return "Complex : " + realPart + ", " + imaginaryPart + "";
    }
}

