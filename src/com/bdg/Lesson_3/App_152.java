package com.bdg.Lesson_3;

public class App_152 {
    public static void main(String[] args) {


        int num = 1732;
        int sum = 1;

        for (int x = 1; x <= num ; x++){
            if (num % x ==0) {
                System.out.println(x);
                sum *= x;
               }
            }
        System.out.println(sum);
    }
}
