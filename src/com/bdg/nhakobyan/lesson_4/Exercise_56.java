package com.bdg.nhakobyan.lesson_4;

public class Exercise_56 {
    public static void main(String[] args) {
        int from = 100 , to = 999; // random number's range
        int num = from + (int)(Math.random() * to); // getting random number
        System.out.println("The number is " + num);
        int a = num / 100;
        int b = (num % 100-num % 10)/10;
        int c = num %10 ;

        if (a > b) System.out.println((double) (a + b + c) / num);
        else{
            System.out.println(num);
        }
    }
}
