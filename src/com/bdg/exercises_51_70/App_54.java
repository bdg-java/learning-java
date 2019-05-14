package com.bdg.exercises_51_70;

public class App_54 {
    public static void main(String[] args) {
        int num = 569;
        int miavor = num % 10;
        int tasnavor = num % 100 / 10;
        int hayruravor = num / 100;
        int max = miavor;
        if (tasnavor > max) {
            max = tasnavor;
        }
        if (hayruravor > max) {
            max = hayruravor;
        }
        System.out.println(max);
    }
}
