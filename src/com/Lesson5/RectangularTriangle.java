package com.Lesson5;

public class RectangularTriangle {
    public static void main(String[] args) {
        int m=5;
        int n=5;

        char [] [] a = new char [m][n];


        for (int i=0; i < n; i++) {
            for ( int k=0;k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
    //public static char[][] getEmptyArray (int size) {

    }

