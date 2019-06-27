package com.bdg.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape  = new Shape();
        Tringle tringle = new Tringle();
        System.out.println(shape.figureName());
        System.out.println(tringle.figureName());


        Shape [] shape1 = new Shape[5];
        shape1[0] = new Tringle();
        shape1[1] = new Rectangle();

        int total=0;

        for(Shape shapes: shape1){
            if(shapes != null) {
                total += shapes.area();
            }
        }

        System.out.println(total);
    }
}
