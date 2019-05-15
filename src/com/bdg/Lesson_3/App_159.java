package com.bdg.Lesson_3;

public class App_159 {
    public static void main(String[] args) {

        long sum =1;

        for (int x = 100; x < 1000; x++){
            if ((x % 3 == 1) && (x % 4 ==2)){
                System.out.println(x);
                sum *= x;
            }
        }
        System.out.println(sum);
    }
}
