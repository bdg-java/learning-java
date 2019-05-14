package com.bdg.exercises_151_210;

public class App_168 {

    public static void main(String[] args) {
        boolean p = true;
        int n = 17;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                p = false;
            }
        }
        System.out.println(p);
    }
}
