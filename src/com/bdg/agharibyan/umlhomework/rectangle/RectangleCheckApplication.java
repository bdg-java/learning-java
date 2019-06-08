package com.bdg.agharibyan.umlhomework.rectangle;

public class RectangleCheckApplication {
    public static void main(String[] args) {

        Rectangle object1 = new Rectangle();
        Rectangle object2 = new Rectangle(2.5f, 5.5f);

        System.out.println(object1.getLength());
        System.out.println(object2.getLength());
        object1.setLength(1.1f);
        System.out.println(object1.getLength());
        object2.setLength(2.2f);
        System.out.println(object2.getLength());
        System.out.println(object1.getWidth());
        System.out.println(object2.getWidth());
        object1.setWidth(1.1f);
        System.out.println(object1.getWidth());
        object2.setWidth(2.2f);
        System.out.println(object2.getWidth());
        System.out.println(object1.getArea());
        System.out.println(object2.getArea());
        System.out.println(object1.getPerimeter());
        System.out.println(object2.getPerimeter());
        System.out.println(object1.toString());
        System.out.println(object2.toString());
    }
}
