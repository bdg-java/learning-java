package com.bdg.hr;

public class HRApplication {

    public static void main(String[] args) {

        Shape shape = new Shape();

        Triangle triangle = new Triangle();
        System.out.println(shape.figureName());
        System.out.println(triangle.figureName());

        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle();
        shapes[1] = new Rectangle();

        int total = 0;
        for (Shape s : shapes) {
            if (s != null) {
                total = total + s.area();
            }
        }
        System.out.println("Total area : " + total);

        new HRManagementTool().findByProfession(new Profession("Developer"));
    }
}
