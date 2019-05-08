package com.bdg;

public class App_32 {
    public static void main(String args[]) {
        int a = 37, b = 5, c = 55, d = 96;
        if (a < b && a < c && a < d) {
            System.out.println(a);
        } else if (b < c && b < d) {
            System.out.println(b);
        } else if (c < d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}
