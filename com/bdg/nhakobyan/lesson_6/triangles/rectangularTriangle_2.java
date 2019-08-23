package com.bdg.nhakobyan.lesson_6.triangles;

public class rectangularTriangle_2 {
    public static void main(String[] args) {
        int [][]  triangle = new int[4][4];

        int starQuantity = triangle.length;
        for (int i = 0; i < triangle.length ; i++) {
            if (i > 0)starQuantity--;
            for (int j = 0; j < starQuantity ; j++) {
                System.out.print(" * ");

            }

            System.out.println();
        }
    }
}
