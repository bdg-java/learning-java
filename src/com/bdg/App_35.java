package com.bdg;

public class App_35 {
    public static void main(String[] args) {

        int a = 15;
        int b = 5;
        int c = 20;
        int d = 40;

        if (a + b + c == d)
            System.out.println("true");

        else if (a + b + d == c) ;
        else if (a + d + c == b) ;
        else if (b + c + d == a)
        System.out.println("true");

        else
            System.out.print("fales");
    }
}
