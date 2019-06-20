package com.bdg.agharibyan.interfacehomework.GeometricObject;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public int resize(int percent) {
        return 0;
    }
}
