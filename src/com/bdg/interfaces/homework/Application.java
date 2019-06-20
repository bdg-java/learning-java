package com.bdg.interfaces.homework;

public class Application {

    public static void main(String[] args) {
        ResizableCircle resizableCircle= new ResizableCircle(3.3);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.resize(15));
        System.out.println(resizableCircle.getArea());
    }
}
