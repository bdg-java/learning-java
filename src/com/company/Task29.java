package com.company;

public class Task29 {
    public static void main(String[] args) {
        int a = 300, b = 54, c = 1252;
        if (a >= b) {
            if (b >= c)
                System.out.print(c + " " + b + " " + a);
            else if (c >= a)
                System.out.print(b + " " + a + " " + c);
            else if (a >= c)
                System.out.print(b + " " + c + " " + a);
        } else {
            if (c >= b)
                System.out.print(a + " " + b + " " + c);
            else if (c >= a)
                System.out.print(a + " " + c + " " + b);
            else if (a >= c)
                System.out.print(c + " " + a + " " + b);
        }

    }
}
