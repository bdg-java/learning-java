package com.bdg;

public class App_36 {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 2, d = 1;
        int x = a%2, y = b%2, z = c%2, v = d%2;
        int t = x + y + z + v;

        if(t >= 2) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
