package com.lesson3;

public class Task184 {
    public static void main(String[] args) {
        int n = 83, i;
        for (i = 1; Math.pow(3, i) < n; i++) ;
        System.out.println(--i);
    }
}
