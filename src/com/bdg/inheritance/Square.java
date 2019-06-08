package com.bdg.inheritance;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {

    }

    public Square(double side, String color, boolean filled) {
        setSide(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return getLength();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Side: " + getSide();
    }
}
