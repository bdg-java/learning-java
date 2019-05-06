package com.bdg;

public class App_35 {
    public static void main(String[] args) {

        int a = 23;
        int b = 35;
        int c = 75;
        int d = 44;

        if ((a == b + c + d)||(b == a + c +d)||(c == a + b +d)||(d == a + b + c) ){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
