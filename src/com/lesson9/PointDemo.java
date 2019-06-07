package com.lesson9;

public class PointDemo {
    public static void main(String[] args) {
        Point2D p = new Point2D(5, 3);
        System.out.println(p);
        p.setXY(6, 4);
        System.out.println(p);
        float[] arr = p.getXY();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        Point3D p2 = new Point3D(5, 8, 6);
        p2.setXYZ(5, -5, -9);
        System.out.println(p2);
    }
}
