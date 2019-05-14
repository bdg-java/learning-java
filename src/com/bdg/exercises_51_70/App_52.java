package com.bdg.exercises_51_70;

public class App_52 {

    public static void main(String[] args) {
        int number = 244;
        boolean t = false;
        int miavor = number % 10;
        int tasnavor = number % 100 / 10;
        int hayruravor = number / 100;
        if (miavor == tasnavor || miavor == hayruravor || tasnavor == hayruravor) {
            t = true;
        }

        System.out.println(t);


    }
}
