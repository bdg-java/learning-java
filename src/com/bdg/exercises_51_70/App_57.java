package com.bdg.exercises_51_70;

public class App_57 {
    public static void main(String[] args) {
        int num = 282;
        double miavor = num % 10;
        double tasnavor = num % 100 / 10;
        double hayruravor = num / 100;
        double result;
        if (num > 300) {
            result = tasnavor / miavor;
        } else {
            result = hayruravor / miavor;
        }
        System.out.println(result);
    }
}
