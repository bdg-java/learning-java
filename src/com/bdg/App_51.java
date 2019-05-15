package com.bdg;

public class App_51 {
    public static void main(String[] args) {

        int t = 123;
        int a = t % 10;
        int b = (t / 10) % 10;
        int c = t / 100;

        if (a == b + c)
            System.out.println("true");
         else {
            System.out.println("false");
        }



    }
}
