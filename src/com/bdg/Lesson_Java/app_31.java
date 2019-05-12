package com.bdg.Lesson_Java;

public class app_31 {
    public static void main(String[] args){
        int a = 3;
        int b = 7;
        int c = 12;
        int d = 100;
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        System.out.println("Maximum  : " + max);
    }
}
