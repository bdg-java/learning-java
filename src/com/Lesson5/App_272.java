package com.Lesson5;

public class App_272 {
    public static void main(String[] args) {
        int n=24;
        int k=0;
        boolean t = false;
        char[] a = {'b', 'b', 'c','a','k','j','b'};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'b')
                k++;
            if (k >= n / 2) {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }
}








