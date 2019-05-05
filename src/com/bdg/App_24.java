package com.bdg;

public class App_24 {
    public static void main(String[] args) {


        int a = 236;
        int b = 459;
        int c = 674;



        if (a==2 && b==2 && c!=2) {
            System.out.println("TRUE");
        } else if (a==2 && c==2 && b!=2) {
            System.out.println("TRUE");
        } else if (b==2 && c==2 && a!=2) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
