package com.bdg.nhakobyan.lesson_4;

public class Exercise_55 {
    public static void main(String[] args) {
        int from = 100 , to = 999;
        int num = from + (int)(Math.random() * to);
        System.out.println("The number is " + num);
        int a = num / 100;
        int b = (num % 100-num % 10)/10;
        int c = num %10 ;

        int min = a;
        if (min < b && min < c)
            System.out.println("Min is " +min);
        else if (min < b && min > c ){
            min = c ;
            System.out.println("Min is " + c);
        }
        else if (min > b ){
            min = b;
            if (min < c)
                System.out.println("Min is " + min);
            else{
                min = c;
                System.out.println("Min is " + min);
            }

        }
    }
}
