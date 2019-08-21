package com.bdg.Homework;

public class App_204 {
    public static void main(String[] args) {
        int N=4444;

        for (int i = 0; i <N ; i *= 10) {
            System.out.println(N/i%10);
        }
    }
}
