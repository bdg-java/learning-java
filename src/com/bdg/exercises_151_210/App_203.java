package com.bdg.exercises_151_210;

public class App_203 {


    public static void main(String[] args) {

        int n = 2241;
        int multiply = 1;
        for (int i = 10; true; i *= 10) {
            multiply *= n % i / (i / 10);
            if (n / i == 0) {
                break;
            }
        }
        System.out.println(multiply);
    }
}
