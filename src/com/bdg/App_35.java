package com.bdg;

public class App_35 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 60;


            if (b == a + c + d) {
                System.out.println(true);
            } else if (c == a + b + d) {
                System.out.println(true);
            } else if (d == c + b + a) {
                System.out.println(true);
            } else if(a == b + c + d){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
    }
}
