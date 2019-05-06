package com.company;

public class Task30 {
    public static void main(String[] args){

        int a = 3000, b = 545656, c = 1252;
        if (a >= b) {
            if (b >= c)
                System.out.print(a + " " + b + " " + c);
            else if (c >= a)
                System.out.print(c + " " + a + " " + b);
            else if (a >= c)
                System.out.print(a + " " + c + " " + b);
        } else {
            if (c >= b)
                System.out.print(c + " " + b + " " + a);
            else if (c >= a)
                System.out.print(b + " " + c + " " + a);
            else if (a >= c)
                System.out.print(b + " " + a + " " + c);
    }
    }
}
