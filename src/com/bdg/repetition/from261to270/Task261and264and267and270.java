package com.bdg.repetition.from261to270;

import java.util.Arrays;

public class Task261and264and267and270 {

    public static void main(String[] args) {

        //Task 261
        int sumX = 0;
        int sumY = 0;

        for(int i = 0; i < rs.X.length; i++){
            sumX += rs.X[i];
            sumY += rs.Y[i];
        }
        double mjnX = (double)sumX/rs.X.length;
        double mjnY = (double )sumY/rs.Y.length;

        System.out.println("Array X is " + Arrays.toString(rs.X));
        System.out.println("Array Y is " + Arrays.toString(rs.Y));
        System.out.println("zangvatsneri tarreri mijin tvabanakanneri artadryal: " + mjnX*mjnY);

        //Task 264
        int quantityX = 0;
        int quantityY = 0;

        for(int i = 0; i < rs.n; i++){
            if(rs.X[i] < 0){
                quantityX++;
            }
            if(rs.Y[i] < 0){
                quantityY++;
            }
        }
        System.out.println("Bacasakan tarreri qanak: X-um " + quantityX + ", Y-um " + quantityY);

        //Task 267
        int sum = 0;

        for(int i = 0; i < rs.n; i ++){
            if(rs.X[i]%7 == 0){
                sum += rs.X[i];
            }
            if(rs.Y[i]%7 == 0){
                sum += rs.Y[i];
            }
        }
        System.out.println("7in bazmapatik tarreri yndhanur gumar: " + sum);

        //Task 270
        sum = 0;

        for(int i = 0; i < rs.n; i++){
            sum += Math.pow(rs.X[i],2) + Math.pow(rs.Y[i],2);
        }
        System.out.println("tarreri qarakusineri yndhanur gumar: " + sum);
    }

}
