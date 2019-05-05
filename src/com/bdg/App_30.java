package com.bdg;

public class App_30 {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 10;

        if (a > b) {
            if (b > c) {
                System.out.println(a + "," + b + "," + c);
            }
            else if (a > c) {
                System.out.println(a + "," + c + "," + b);
            }
            else {
                System.out.println(c + "," + a + "," + b);
            }
        } else {
            if (b < c) {
                System.out.println(c + "," + b + "," + a);
            }
            else if (a > c){
                System.out.println(b + "," + a + "," + c);
            }
            else {
                System.out.println(b + "," + c + "," + a);
            }
        }
    }
}
