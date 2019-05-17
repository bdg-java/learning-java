package com.bdg.Lesson_4;

public class App_215 {
    public static void main(String[] args) {

        int [] x =IntegerArrayoperations.getDefaultArray();
        int sum_1 =0;
        double z = 0;

        for ( int i = 0; i < x.length; i += 2){
            sum_1 += x[i];
            z += 1;

        }
        System.out.println(sum_1/z);
    }
}
