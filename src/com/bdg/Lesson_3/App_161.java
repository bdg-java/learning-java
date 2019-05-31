package com.bdg.Lesson_3;

public class App_161 {
    public static void main(String[] args) {

        int max = -1;

        for (int x = 9999 ; x >= 1000; x--){
            double t = x *14;
            if (Math.sqrt(t) % 1 == 0) {
            max = x;
            break;
            }
        }
        System.out.println(max);
    }
}
