package com.bdg.nhakobyan.lesson_6.triangles;

public class equalizedTriangle {
    public static void main(String[] args) {
        int [][]  triangle = new int[4][6];
        int starQuantity = 1;
        int space = triangle.length;
        for (int i = 0; i < triangle.length ; i++) {


            for (int k = 0; k < space ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starQuantity ; j++) {
                System.out.print(" * ");

            }
            System.out.println();
            space--;
            starQuantity++;
        }

    }
}
