package com.bdg.pastreapeat;

public class App_34 {

    public static void main(String[] args) {
        int a = 22;
        int b = 12;
        int c = 34;
        int d = 0;

        if (a + b == c + d || b + c == a + d || b + d == a + c  ){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
