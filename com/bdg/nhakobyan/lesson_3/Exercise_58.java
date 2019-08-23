package com.bdg.nhakobyan.lesson_3;

public class Exercise_58 {
    public static void main(String[] args) {
        int from = 100 , to = 999; // random number's range
        int num = from + (int)(Math.random() * to); // getting random number
        System.out.println("The number is " + num);
        int haryuravor = num / 100;
        int tasnavor = (num % 100-num % 10)/10;
        int miavor = num %10 ;

        String f = "a";
        if  ((tasnavor + haryuravor) < 5) System.out.println(f);
        else{
            f = "b";
            System.out.println(f);
        }
    }
}
