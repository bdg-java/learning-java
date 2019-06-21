package com.bdg.Lesson_12.Geometric_Object;

public class ResizableCircle extends Circle implements Resizeable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public boolean resize(int percent) {
        if(percent != 0) {
            radius = radius + radius * percent / 100;
            return true;
        }
        return false;
    }
}