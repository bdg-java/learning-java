package com.bdg;

public class App_35 {
    public static void main(String args[]) {
        int a = 37, b = 20, c = 1, d = 16;

        if ((a == b + c + d) || (b == a + c + d) || (c == a + b + d) || (d == a + b + c)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
