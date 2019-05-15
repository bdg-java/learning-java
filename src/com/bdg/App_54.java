package com.bdg;

public class App_54 {

    public static void main(String[] args) {

        int t = 245;

        int a = t % 10;
        int b = t / 100;
        int c = t / 10 % 10;

        if ( a > b && a > c )
        System.out.println("a max");

        else if ( b >  a && b > c )
            System.out.println("b max");

        else
            System.out.println("c max");

    }
}
