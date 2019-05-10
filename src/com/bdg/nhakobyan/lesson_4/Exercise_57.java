package com.bdg.nhakobyan.lesson_4;

public class Exercise_57 {
    public static void main(String[] args) {
        int from = 100 , to = 999; // random number's range
        int num = from + (int)(Math.random() * to); // getting random number
        System.out.println("The number is " + num);
        int a = num / 100;
        int b = (num % 100-num % 10)/10;
        int c = num %10 ;

        if (num > 300){
            System.out.println(" b / a "+b / a);
        }
        else{
            System.out.println("c / a "+c / a );
        }
    }
}
