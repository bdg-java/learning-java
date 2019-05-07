package com.bdg;

public class App_31_32 {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        if (a > b) {
            if (a > c && a > d) {
                System.out.println("Maximum :" + a);
            } else {
                if(d > c) {
                    System.out.println("Maximum :" + d);
                }else{
                    System.out.println("Maximum :" + c);
                }
            }
        } else {
            if (b > c && b > d) {
                System.out.println("Maximum :" + b);
            } else {
                if(d > c){
                    System.out.println("Maximum :" + d);
                }
                else {
                    System.out.println("Maximum :" + c);
                }
            }
        }

        if (a < b) {
            if (a < c && a < d) {
                System.out.println("Maximum :" + a);
            } else {
                if(d < c) {
                    System.out.println("Maximum :" + d);
                }else{
                    System.out.println("Maximum :" + c);
                }
            }
        } else {
            if (b < c && b < d) {
                System.out.println("Maximum :" + b);
            } else {
                if(d < c){
                    System.out.println("Maximum :" + d);
                }
                else {
                    System.out.println("Maximum :" + c);
                }
            }
        }

    }
}
