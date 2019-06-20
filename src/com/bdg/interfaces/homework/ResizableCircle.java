package com.bdg.interfaces.homework;

public class ResizableCircle extends Circle implements Resizable {
    ResizableCircle(double radius) {
        super(radius);
    }

    public boolean resize(int percent) {

        if (percent < 0) {
            System.out.println(radius);
            radius = radius - (radius * Math.abs(percent) / 100);
            System.out.println(radius);
            return true;
        } else if (percent > 0) {
            radius = radius + ((radius * percent) / 100);
            return true;
        }

        return false;
    }
}
