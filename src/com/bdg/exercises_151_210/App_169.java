package com.bdg.exercises_151_210;

public class App_169 {
    public static void main(String[] args) {
        int x = 5;
        int y = 12;
        int z = 5;
        for (int i = 2; i < (x + y); i++) {
            if ((x + y) % i == 0) {
                z = 6;
            }
        }
        System.out.println(z);
    }
}
