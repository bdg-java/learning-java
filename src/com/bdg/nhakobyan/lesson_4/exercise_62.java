package com.bdg.nhakobyan.lesson_4;

public class exercise_62 {
    public static void main(String[] args) {
        int from = 1000 , to = 9999; // random number's range
        int num = from + (int)(Math.random() * to); // getting random number
        System.out.println("The number is " + num);
        int miavor = num % 10;
        int tasnavor = (num / 10)% 10;
        int haryuravor = (num / 100) % 10 ;
        int hazaravor = num / 1000;

        if (num < 5000) {
            System.out.println(num / (miavor + haryuravor));
        }
        else{
            System.out.println( num / ( hazaravor + tasnavor));
        }
    }
}
