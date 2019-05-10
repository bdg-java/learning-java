package com.bdg.nhakobyan.lesson_4;



public class Exercise_52 {
    public static void main(String[] args) {
        int from = 100 , to = 999;
        int num = from + (int)(Math.random() * to);
        System.out.println("The number is "+num);
        boolean bool = false ;
        int a = num / 100;
        int b = (num % 100-num % 10)/10;
        int c = num %10 ;

        if (a == b || a == c || b == c){
            bool = true;
            System.out.println(bool);
        }
        else{
            System.out.println(bool);
        }

    }
}
