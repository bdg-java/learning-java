package com.bdg;

public class App_24 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;

        if ((a == 2 && b == 2 && c != 2) || (a == 2 && c == 2 && b != 2) || (b == 2 && c == 2 && a != 2)){
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }
    }
}
