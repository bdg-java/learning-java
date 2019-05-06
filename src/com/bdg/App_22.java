package com.bdg;

public class App_22 {


    public static void main(String[] args) {

        // int a = 10, b = 20, c = 2; senc el karox eq haytararel ete popoxakanneri yipery nuynen

        int a = 10;
        int b = 20;
        int c = 2;


        if (a < b) {
            if (a < c) {
                //a - n erkusic el poqra => poqraguyna
                System.out.println("MINIMUM : " + a);
            } else {
                // c - n poqrna
                System.out.println("MINIMUM : " + c);
            }
        } else {
            if (b < c) {
                //b - n poqrna
                System.out.println("MINIMUM : " + b);
            } else {
                // c - n poqrna
                System.out.println("MINIMUM : " + c);
            }
        }


    }
}
