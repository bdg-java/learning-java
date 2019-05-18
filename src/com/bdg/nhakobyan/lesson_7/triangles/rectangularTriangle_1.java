package com.bdg.nhakobyan.lesson_7.triangles;

public class rectangularTriangle_1 {
    public static void main(String[] args) {
        int arr [][] = new int[4][4];
        int starQuantity = 1;
        for (int i = 0; i < arr.length ; i++) {
            if (i == 0){
                System.out.print(" * ");

            }
            if (i > 0) {
                starQuantity++;

                for (int j = 0; j < starQuantity; j++) {
                    System.out.print(" * ");
                    if (starQuantity == arr.length+1 )
                        break;
                }
            }
            System.out.println();

        }
    }
}
