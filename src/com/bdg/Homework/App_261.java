package com.bdg.Homework;

public class App_261 {
    public static void main(String[] args) {


        int n = 5;
        int[] x = new int[n];
        int[] y = new int[n];
        int sumX = 0;
        int sumY = 0;

        x[0] = 2;
        x[1] = 4;
        x[2] = 5;
        x[3] = -6;
        x[4] = 0;
        y[0] = 11;
        y[1] = 44;
        y[2] = 19;
        y[3] = 32;
        y[4] = -66;

        for (int i = 0; i < x.length; i++) {
            sumX += x[i];
        }
        for (int k = 0; k <y.length ; k++) {
            sumY += y[k];
        }
        System.out.println((sumX/n)+(sumY/n));
    }
}
