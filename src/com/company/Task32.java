package com.company;

public class Task32 {
    public static void main(String[] args){
        int a = 0, b = 4, c = 989, d = 600;
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;
        System.out.println("Min is  : " + min);
   }
}