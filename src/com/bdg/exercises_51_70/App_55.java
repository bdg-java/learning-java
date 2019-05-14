package com.bdg.exercises_51_70;

public class App_55 {

    public static void main(String[] args) {
        int num = 102;
        int miavor = num % 10;
        int tasnavor = num % 100 / 10;
        int hayruravor = num / 100;
        int min = miavor;
        if (tasnavor < min) {
            min = tasnavor;
        }
        if (hayruravor < min) {
            min = hayruravor;
        }
        System.out.println(min);
    }
}
