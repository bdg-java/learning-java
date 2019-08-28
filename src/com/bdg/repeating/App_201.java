package com.bdg.repeating;

public class App_201 {
    public static void main(String[] args) {
        int n= 12345;
    int a = n/10000;
    int b = n%10000/1000;
    int c = n%1000/100;
    int d = n%100/10;
    int e = n%10;
        System.out.println(a  + b + c +d+e);

    }
}
