package com.bdg.nhakobyan.lesson_3;

public class exercise_66 {
    public static void main(String[] args) {
        int from = 1000 , to = 9999; // random number's range
        int num = from + (int)(Math.random() * to); // getting random number
        System.out.println("The number is " + num);
        int tasnavor = (num / 10)% 10;
        int haryuravor = (num / 100) % 10 ;

        if  (tasnavor == 4 || haryuravor == 4)
            System.out.println("YES");
        else{ System.out.println("NO"); }
    }
}
