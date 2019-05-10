package com.bdg.AHakobyan;

public class App_38 {
    public static void main(String []args) {

        int a = 20;
        int b = 15;
        int c = 10;
        int d = 5;

        if ((a/b)==(c/d)||(a/c)==(b/d)||(a/d)==(b/c)||(b/a)==(c/d)||(d/a)==(b/c)||(d/b)==(a/c)||(d/c)==(a/b)){
            System.out.print("TRUE");
        }else
            System.out.print("FALSE");
    }
}
