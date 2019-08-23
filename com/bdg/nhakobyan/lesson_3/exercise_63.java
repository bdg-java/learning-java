package com.bdg.nhakobyan.lesson_3;

public class exercise_63 {
    public static void main(String[] args) {
        int from = 1000 , to = 9999; // random number's range
        int num = from + (int)(Math.random() * to); // getting random number
        System.out.println("The number is " + num);
        int miavor = num % 10;
        int tasnavor = (num / 10)% 10;
        int haryuravor = (num / 100) % 10 ;
        int hazaravor = num / 1000;

        if (miavor == 1  || tasnavor == 1 || haryuravor == 1 || hazaravor == 1)
            System.out.println(1);
        else{
            System.out.println(0);
        }
    }
}
