package com.bdg;

public class App_176 {

    public static void main(String[] args) {
        int n = 15;
        int k = 40_000_000;


        int f1 = 1;
        int f2 = 1;
        for (int i = 3; i < n; i++) {
            System.out.println(f1 + f2);
            int tmp = f1;
            f1 = f2;
            f2 = tmp + f2;
        }


    }
}































