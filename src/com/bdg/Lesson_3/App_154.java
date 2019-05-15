package com.bdg.Lesson_3;

public class App_154 {
    public static void main(String[] args) {


        int num = 3745;
        int sum = 1;

        for (int x =1; x <= num ; x++ ){
            if (num % x== 3){
                System.out.println(x);
                sum = sum * x;
            }
        }
        System.out.println(sum);
    }
}
