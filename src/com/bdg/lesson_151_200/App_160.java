package com.bdg.lesson_151_200;

public class App_160 {
    public static void main(String[] args) {
        int n;

        for(n=1;n<=50;n++) {
            int x = (int) Math.pow(n,2);
            if (x>= 100 && x<=999) {
                System.out.println(x);
                break;
            }
        }
    }
}