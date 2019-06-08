package com.bdg.agharibyan.umlhomework.circlefinal;

public class CircleFinalCheckApplication {
    public static void main(String[] args) {

        CircleFinal object1 = new CircleFinal();
        CircleFinal object2 = new CircleFinal(2.5);
        CircleFinal object3 = new CircleFinal(5.0, "blue");

        System.out.println("firstObjectRadius:"+ object1.getRadius());
        System.out.println("secondObjectRadius:"+ object2.getRadius());
        System.out.println("thirdObjectRadius:"+ object3.getRadius());
        System.out.println("firstObjectColor:"+ object1.getColor());
        System.out.println("secondObjectColor:"+ object2.getColor());
        System.out.println("thirdObjectColor:"+ object3.getColor());
        System.out.println("firstObject:"+ object1.toString());
        object1.setRadius(1.1);
        object1.setColor("white");
        System.out.println("firstObjectAfterSetter:"+ object1.toString());
        System.out.println("secondObject:"+ object2.toString());
        object2.setRadius(2.2);
        object2.setColor("yellow");
        System.out.println("secondObjectAfterSetter:"+ object2.toString());
        System.out.println("thirdObject:"+ object3.toString());
        object3.setRadius(3.3);
        object3.setColor("black");
        System.out.println("thirdObjectAfterSetter:"+ object3.toString());
        System.out.println("firstObjectArea:"+ object1.getArea());
        System.out.println("secondObjectArea:"+ object2.getArea());
        System.out.println("thirdObjectArea:"+ object3.getArea());
    }
}
