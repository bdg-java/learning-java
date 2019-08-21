package com.bdg.Homework;

public class App_263 {
    public static void main(String[] args) {

        int n = 5;
        int[] x = new int[n];
        int[] y = new int[n];
        int count = 0;

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
            if (x[i] > 0) {
                count++;
            }
        }
        for (int k = 0; k < y.length; k++) {
            if (y[k] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
