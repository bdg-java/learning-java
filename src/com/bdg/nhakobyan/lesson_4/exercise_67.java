package com.bdg.nhakobyan.lesson_4;

public class exercise_67 {
    public static void main(String[] args) {
        int from = 1000 , to = 9999; // random number's range
        int num = from + (int)(Math.random() * to); // getting random number
        System.out.println("The number is " + num);
        int miavor = num % 10;
        int tasnavor = (num / 10)% 10;
        int haryuravor = (num / 100) % 10 ;
        int hazaravor = num / 1000;

        if  (Math.sqrt(num) == miavor + tasnavor + haryuravor + hazaravor)
            System.out.println("YES");
        else{
            System.out.println("NO");
        }
    }
}
