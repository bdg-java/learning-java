package com.bdg.agharibyan.inheritanceHomwork.Point2DPoint3D;

public class Application {
    public static void main(String[] args) {

        Point2D point2DDemo = new Point2D( 1.5f, 2.5f);
        Point3D point3DDemo = new Point3D(1.5f, 1.5f, 3.5f);

        System.out.println(point2DDemo.toString());
        System.out.println(point3DDemo.toString());
        System.out.println(point2DDemo.getX());
        System.out.println(point2DDemo.getY());
        System.out.println(point3DDemo.getZ());
        System.out.println(point2DDemo.getXY());
        System.out.println(point3DDemo.getXYZ());
        point2DDemo.setXY(1.0f, 2.0f);
        System.out.println(point2DDemo.getX());

        //getXY, getXYZ artatpum e @ov nshannery(hascen Heapum)

    }
}
