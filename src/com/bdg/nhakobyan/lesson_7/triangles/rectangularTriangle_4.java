package com.bdg.nhakobyan.lesson_7.triangles;

public class rectangularTriangle_4 {
    public static void main(String[] args) {
        int [][]  triangle = new int[4][4];
        int starQuantity = 1;
        int space = triangle.length;
        for (int i = 0; i < triangle.length ; i++) {
            if (i > 0){
                starQuantity++;
                space--;
            }
            for (int k = 0; k < space ; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < starQuantity ; j++) {
                System.out.print(" *");

            }
            System.out.println();
        }
    }
}
