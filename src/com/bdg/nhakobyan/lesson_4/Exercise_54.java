package com.bdg.nhakobyan.lesson_4;

public class Exercise_54 {
    public static void main(String[] args) {
        int from = 100 , to = 999;
        int num = from + (int)(Math.random() * to);
        System.out.println("The number is "+num);
        int a = num / 100;
        int b = (num % 100-num % 10)/10;
        int c = num %10 ;

        int max = a;
        if (max > b && max > c)
             System.out.println("Max is " +max);
        else if (max > b && max < c ){
             max = c ;
             System.out.println("Max is " + c);
        }
        else if (max < b ){
                max = b;
                if (max > c)
                    System.out.println("Max is " + max);
                else{
                    max = c;
                    System.out.println("Max is " + max);
                }

        }
    }
}
