package com.Lesson5;

public class App_275 {
    public static void main(String[] args) {
        int n=10;

        int c=0;

        char[] a = {'s', 'b', 'c','k','j','b', 's', '4','h','q'};
        for (int i=0; i < a.length; i++) {
            if (a[i] < 'k') {

                c++;
            }
        }
        System.out.println(c);
    }

}
