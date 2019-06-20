package com.bdg.interfaces.homework;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public boolean resize(int percent) {

        if (percent == 0) {
         return false;
        }
        radius = radius + ((radius * percent) / 100);
        return true;
    }
}
