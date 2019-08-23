package com.bdg.nhakobyan.lesson_3;

public class Exercise_53 {
    public static void main(String[] args) {
        int from  = 100 , to = 999;
        int num = from + (int)(Math.random() * to);
        int k = from + (int)(Math.random()*to);
        System.out.println("The number is "+num);
        System.out.println("The given 'k' is " + k);
        int haryuravor = num / 100;
        int tasnavor = (num / 10) % 10;
        int miavor = num %10 ;

        if ( num > k) System.out.println((double) num / (miavor + tasnavor + haryuravor));
        else{
            System.out.println((double)miavor/num);
        }
    }
}
