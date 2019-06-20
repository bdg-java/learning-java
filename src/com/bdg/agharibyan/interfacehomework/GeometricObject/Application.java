package com.bdg.agharibyan.interfacehomework.GeometricObject;

public class Application {

    public static void main(String[] args) {

        ResizableCircle resizableCircle = new ResizableCircle(10);
        System.out.println("Perimeter:"+ resizableCircle.getPerimeter());
        System.out.println("Area:"+ resizableCircle.getArea());
        System.out.println("Resize:"+ resizableCircle.resize(100));
        System.out.println("Perimeter after resize:"+ resizableCircle.getPerimeter());
        System.out.println("Resize:"+ resizableCircle.resize(0));
        System.out.println("Perimeter after resize:"+ resizableCircle.getPerimeter());

    }
}
