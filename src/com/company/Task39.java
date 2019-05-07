package com.company;

public class Task39 {
    public static void main(String[] args) {
    int a = 10, b = 5, c = 100, d = -5;
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t; }

        if (c > d) {
            t = c;
            c = d;
            d = t; }

        if (a > c) {
            t = a;
            a = c;
            c = t; }
        if (b > d) {
            t = b;
            b = d;
            d = t; }
        if (b > c){
            t = b;
            b = c;
            c = t; }
        System.out.print(a + " " + b + " " + c + " " + d);
    }

}
