package com.lesson2;

public class Task51 {
    public static void main(String[] args) {
        int a = 112;
        boolean t = false;
        if(a % 10 ==  a / 100 +  a/ 10 % 10)
            t = true;
        else t = false;
        System.out.print(t);
    }
}
