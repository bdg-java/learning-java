package com.bdg.nhakobyan.lesson_3;



public class Exercise_52 {
    public static void main(String[] args) {
        int from = 100 , to = 999;
        int num = from + (int)(Math.random() * to);
        System.out.println("The number is "+num);
        boolean bool = false ;
        int miavor  = num % 10;
        int tasnavor = (num / 10)% 10;
        int haryuravor = num / 100 ;

        if (miavor == tasnavor  || miavor == haryuravor || tasnavor == haryuravor){
            bool = true;
            System.out.println(bool);
        }
        else{
            System.out.println(bool);
        }

    }
}
