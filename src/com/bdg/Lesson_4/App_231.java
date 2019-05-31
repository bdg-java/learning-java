package com.bdg.Lesson_4;

public class App_231 {
         public static void main(String[] args) {

            int[] x = IntegerArrayoperations.getDefaultArray();

            int sum = 0;

            for (int n = 0; n < x.length; n++) {
                if ((x[n ] & 1) == 0)
                    sum += x[n] * x[n];
            }
            System.out.println(sum);
        }
    }