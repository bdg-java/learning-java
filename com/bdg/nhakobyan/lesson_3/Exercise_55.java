package com.bdg.nhakobyan.lesson_3;

public class  Exercise_55 {
    public static void main(String[] args) {
        int from = 100 , to = 999;
        int num = from + (int)(Math.random() * to);
        System.out.println("The number is " + num);
        int miavor = num % 10;
        int tasnavor = (num / 10)% 10;
        int haryuravor = num / 100 ;

        int min = miavor;
        if (min < tasnavor && min < haryuravor)
            System.out.println("Min is " +min);
        else if (min < tasnavor && min > haryuravor ){
            min = haryuravor ;
            System.out.println("Min is " + haryuravor);
        }
        else if (min > tasnavor ){
            min = tasnavor;
            if (min < haryuravor)
                System.out.println("Min is " + min);
            else{
                min = haryuravor;
                System.out.println("Min is " + min);
            }

        }
    }
}
