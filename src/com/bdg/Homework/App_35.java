package com.bdg.Homework;

public class App_35 {
    public static void main(String[] args) {

        int a = 11;
        int b = 22;
        int c = 33;
        int d = 66;

        if ((a + b + c) == d || (a + b + d) == c || (a + c + d) == b || (b + c + d) == a){
            System.out.println("true");
        }else System.out.println("false");
    }
}
