package com.bdg.nhakobyan.lesson_6.triangles;

public class rectangularTriangle_1 {
    public static void main(String[] args) {
        int arr [][] = new int[4][4];
        int starQuantity = 1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < starQuantity; j++) {
                System.out.print(" * ");
            }
            starQuantity++;
            System.out.println();

        }
    }
}
