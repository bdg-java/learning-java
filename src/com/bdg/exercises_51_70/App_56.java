package com.bdg.exercises_51_70;

public class App_56 {
    public static void main(String[] args) {
        int num = 382;
        double miavor = num % 10;
        double tasnavor = num % 100 / 10;
        double hayruravor = num / 100;
        double result = num;
        if (miavor > tasnavor) {
            result = (miavor + tasnavor + hayruravor) / num;
        }
        System.out.println(result);
    }
}
