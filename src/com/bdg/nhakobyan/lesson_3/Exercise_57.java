package com.bdg.nhakobyan.lesson_3;

public class Exercise_57 {
    public static void main(String[] args) {
        int from = 100 , to = 999; // random number's range
        int num = from + (int)(Math.random() * to); // generating a  random number
        System.out.println("The number is " + num);
        int miavor = num % 10;
        int tasnavor = (num / 10)% 10;
        int haryuravor = num / 100 ;

        if  (num > 300){
            System.out.println(" b / c " + tasnavor / miavor);
        }
        else{
            System.out.println("a / c " + haryuravor / miavor );
        }
    }
}
