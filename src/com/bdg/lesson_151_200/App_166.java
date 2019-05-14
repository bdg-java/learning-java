package com.bdg.lesson_151_200;

public class App_166 {
    public static void main(String[] args) {
        int y = 0;
        int n = 10;
        int j = n;
        for (int k = 1; k<=j; k++) {
            if (n == Math.pow(4, k)) {
                y=1;break;
            } else {
                y=0;
            }
        } System.out.println(y);
    }
}
