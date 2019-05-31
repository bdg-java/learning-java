package com.bdg.Lesson_3;

public class App_153 {
    public static void main(String[] args) {

        int n = 4;
        int num = 3965;
        int sum = 0;

        for (int x = 0; x <= num; x++){
            if (x % n ==2){
                System.out.println(x);
                sum = sum +x;
            }
        }
        System.out.println(sum);
    }
}
