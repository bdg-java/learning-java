package com.bdg;

public class App_291 {

    public static void main(String[] args) {


       int n = 8;

       int [] x = new int [n];

       int count = 0;

       for (int i = 0; i <n ; i++) {
           x[i] = (int) (Math.random() * (99 - (-99) + 1) - 99);
           if (x[i] > 0) {
               count++;
           }
       }
               int[] y = new int[n - count];

               System.out.print((x));
               System.out.println();
               int num = 0;
               for (int i = 0; i < n; i++) {
                   if (x[i] < 0) {
                       y[num] = x[i];
                       num++;

                   }
               }

           }
    }

