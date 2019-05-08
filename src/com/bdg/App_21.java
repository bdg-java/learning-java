package com.bdg;

public class App_21 {

    public static void main(String args[]) {
        int a = 128, b = 121, c = 38;
        if (a > b && a > c) {
            System.out.println("Maximum is " + a);
        } else if (b > c) {
            System.out.println("Maximum is " + b);
        } else {
            System.out.println("Maximum is " + c);
        }

        //more efficient
        int max = a;
        if(b>max){
            max =b;
        }if(c>max){
            max = c;
        }

        System.out.println(max);
    }
}
