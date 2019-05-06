package com.company;

public class Task22 {
    public static void main(String[] args) {
        int a = 900,  b = 700,  c = 0;
        if(a < b && a < c)
            System.out.println("First is min : " + a);
        else if (b < a && b < c)
            System.out.println("Second is min : " + b);
        else
            System.out.println("Third is min : " + c);
    }
}
