package com.bdg.Lesson_3;

public class App_156 {
    public static void main(String[] args) {

        long sum = 1;

        for (int x = 10; x <100; x++){
            if ((x % 3 ==0) && (x % 5 ==0)){
                System.out.println(x);
                sum *= x;
            }
        }
        System.out.println(sum);
    }
}
