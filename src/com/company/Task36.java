package com.company;

public class Task36 {
    public static void main(String[] args) {
        int a = 1, b = 18, c = 17, d = 25;
        int k = 0;
        if((a&1) == 1)
            k++;
        if((b&1) == 1)
           k++;
        if((c&1) == 1)
            k++;
        if((d&1) == 1)
            k++;
        if (k >= 2 )
            System.out.println(1);
        else
            System.out.println(2);
    }
}
