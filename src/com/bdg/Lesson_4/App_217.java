package com.bdg.Lesson_4;

public class App_217 {
    public static void main(String[] args) {

        int[] x = IntegerArrayoperations.getDefaultArray();
        int sum = 1;

        for (int i = 1; i < x.length; i += 2) {
            sum *= x[i] * x[i] ;
        }

         System.out.println(sum);
    }
}
