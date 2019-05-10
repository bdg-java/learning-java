package com.bdg.nhakobyan.lesson_4;

public class Exercise_53 {
    public static void main(String[] args) {
        int from = 100 , to = 999;
        int num = from + (int)(Math.random() * to);
        System.out.println("The number is "+num);
        int a = num / 100;
        int b = (num % 100-num % 10)/10;
        int c = num %10 ;

        int k = num / (a + b + c);
        int d = (a + b + c)/num;
        if ( k > d) System.out.println(k);
        else{
            System.out.println(d);
        }
    }
}
