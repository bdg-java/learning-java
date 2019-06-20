package com.bdg.agharibyan.interfacehomework.GeometricObject;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius){
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
