package com.company;

public class Task31 {
    public static void main(String[] args){
        int a = 200, b = 4, c = 989, d = 600;
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
           max = c;
        if (d > max)
           max = d;
            System.out.println("Max is  : " + max);
    }
}
