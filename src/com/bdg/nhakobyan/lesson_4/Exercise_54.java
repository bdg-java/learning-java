package com.bdg.nhakobyan.lesson_4;

public class Exercise_54 {
    public static void main(String[] args) {
        int from = 100 , to = 999;
        int num = from + (int)(Math.random() * to);
        System.out.println("The number is "+num);
        int miavor = num % 10;//a b c
        int tasnavor = (num / 10)% 10;
        int haryuravor = num / 100 ;

        int max =miavor;
        if (max > tasnavor && max > haryuravor)
             System.out.println("Max is " +max);
        else if (max > tasnavor && max < haryuravor ){
             max = haryuravor ;
             System.out.println("Max is " + haryuravor);
        }
        else if (max < tasnavor ){
                max = tasnavor;
                if (max > haryuravor)
                    System.out.println("Max is " + max);
                else{
                    max = haryuravor;
                    System.out.println("Max is " + max);
                }

        }
    }
}
