package com.bdg.Java_Lesson2;

public class App_55 {
    public static void main (String[]args){
        int abc = 365;
        int a = 365/100;
        int b = 365/10%10;
        int c = 365/10;

        if (a < b && a < c) {
            System.out.println("MINIMUM" + a);
        }
        else if (b < a && b < c){
            System.out.println("MINIMUM" + b);
        }
        else if (c < a && c < b){
            System.out.println("MNIMUM" +c);
        }
    }
}
