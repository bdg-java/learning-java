package com.bdg.Lesson_Loop;

public class App_151 {
    public static void main(String[] args) {
        int n =99;
        int number = 0;
        for (int i = 1; i<=n; i++) {
            if(n%i == 0) {
                number += i;
            }
        }
        System.out.println(number);
    }
}
