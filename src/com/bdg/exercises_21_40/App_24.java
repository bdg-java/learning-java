package com.bdg.exercises_21_40;

public class App_24 {

    public static void main(String args[]) {
        int a = 2, b = 3, c = 2;

        if (a == 2 && b == 2) {
            System.out.println(true);
        } else if (c == 2 && a == 2 || c == 2 && b == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
