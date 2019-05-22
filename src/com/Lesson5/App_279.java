package com.Lesson5;

public class App_279 {
    public static void main(String[] args) {
        int n = 10;
        int c = 0;
        int k = 0;

        char[] a = {'d', 'b', 'c', 'k', 'j', 'b', 'r', '4', 'h', 'q'};
        char [] b = new char [a.length] ;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >'k') {

                b[k] = a[i];
                k++;
            }

        }

        System.out.println (b) ;
    }
}
