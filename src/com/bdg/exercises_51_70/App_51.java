package com.bdg.exercises_51_70;

public class App_51 {
    public static void main(String[] args) {
        int number = 246;
        int miavor = number % 10;
        int tasnavor = number % 100 / 10;
        int hayruravor = number / 100;
        boolean t = false;
        if (miavor == tasnavor + hayruravor) {
            t = true;
        }
        System.out.println(t);
    }
}
