package com.bdg.lesson_151_200;

public class App_165 {
    public static void main(String[] args) {
        boolean t = true;
        int n = 27;
        int j = n;
        for (int k = 1; k<=j; k++) {
            if (n == Math.pow(3, k)) {
                t= true;break;
            } else {
                t=false;
            }
        } System.out.println(t);
    }
}