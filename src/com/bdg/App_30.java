package com.bdg;

public class App_30 {

    public static void main(String[] args) {

        int a = -1;
        int b = 9;
        int c = 100;

        if (a > b) {
            if (b > c) {
                System.out.println(a +","+ b +","+ c);
            } else {
                if (a > c) {
                    System.out.println(a +","+ c +","+ b);
                } else {
                    System.out.println(c +","+ a +","+ b);
                }
            }
        } else {
            if (a > c) {
                System.out.println(b +","+ a +","+ c);
            } else {
                if (b > c) {
                    System.out.println(b +","+ c +","+ a);
                } else {
                    System.out.println(c +","+ b +","+ a);
                }
            }
        }
    }
}
