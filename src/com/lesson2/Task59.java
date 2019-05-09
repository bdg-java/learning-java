package com.lesson2;

public class Task59 {
    public static void main(String[] args) {
        int a =214;
        int f = a /100;
        int s = a / 10 % 10;
        int t = a % 10;

        int p = 0;

        if(f > s) {
            p = f;
            f = s;
            s= p;
        }
        if (f > t){
            p = f;
            f = t;
            t= p;
        }
        if (s > t){
            p = s;
            s = t;
            t= p;
        }
        System.out.print(f + " " + s + " " + t);


    }
}
