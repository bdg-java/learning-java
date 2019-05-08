package com.bdg;

public class App_36 {
    public static void main(String args[]) {
        int a = 37, b = 59, c = 55, d = 96;
        int aModulo = a % 2;
        int bModulo = b % 2;
        int cModulo = c % 2;
        int dModulo = d % 2;

        if ((aModulo + bModulo + cModulo + dModulo) >= 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
