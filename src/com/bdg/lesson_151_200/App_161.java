package com.bdg.lesson_151_200;

public class App_161 {
    public static void main(String[] args) {
        int n;

        for(n=1;n<=100;n++) {
            int x = ((int) Math.pow(n,2))*26;
            if (x>= 1000 && x<=9999) {
                System.out.println(x);
                break;
            }
        }
    }
}
