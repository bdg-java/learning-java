package com.bdg.nhakobyan.lesson_3;

public class Exercise_56 {
    public static void main(String[] args) {
        int from = 100 , to = 999; // random number's range
        int num = from + (int)(Math.random() * to); // getting random number
        System.out.println("The number is " + num);
        int miavor = num % 10;
        int tasnavor = (num / 10)% 10;
        int haryuravor = num / 100 ;

        if  (miavor > tasnavor) System.out.println((double) (miavor + tasnavor + haryuravor) / num);
        else{
            System.out.println(num);
        }
    }
}
