package com.bdg.nhakobyan.lesson_3;

public class exercise_64 {
    public static void main(String[] args) {
        int from = 1000 , to = 9999; // random number's range
        int num = from + (int)(Math.random() * to); // getting random number
        System.out.println("The number is " + num);
        int miavor = num % 10;
        int tasnavor = (num / 10)% 10;
        int haryuravor = (num / 100) % 10 ;
        int hazaravor = num / 1000;

        char y =  'd';
        if (miavor + tasnavor == 5){
            y = 's';
            System.out.println(y);
        }
        else{
            System.out.println(y);
        }
    }
}
