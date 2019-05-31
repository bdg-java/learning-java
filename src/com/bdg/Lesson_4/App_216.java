package com.bdg.Lesson_4;

public class App_216 {
    public static void main(String[] args) {

        int [] x =IntegerArrayoperations.getDefaultArray();
        int sum_1 =1;

        for ( int i = 0; i < x.length; i += 2){
            sum_1 *= x[i];


        }
        System.out.println(sum_1);


    }
}
