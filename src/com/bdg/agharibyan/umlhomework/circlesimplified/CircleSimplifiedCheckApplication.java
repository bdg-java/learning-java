package com.bdg.agharibyan.umlhomework.circlesimplified;

public class CircleSimplifiedCheckApplication {
    public static void main(String[] args) {
        CircleSimplified object1 = new CircleSimplified();
        CircleSimplified object2 = new CircleSimplified(2.5);

        System.out.println(object1.getRadius());
        System.out.println(object2.getRadius());
        object1.setRadius(1.1);
        System.out.println(object1.getRadius());
        object2.setRadius(2.2);
        System.out.println(object2.getRadius());
        System.out.println(object1.getArea());
        System.out.println(object2.getArea());
        System.out.println(object1.getCircumference());
        System.out.println(object2.getCircumference());
        System.out.println(object1.toString());
        System.out.println(object2.toString());
    }
}
