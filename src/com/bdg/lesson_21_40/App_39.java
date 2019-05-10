package com.bdg.lesson_21_40;

public class App_39 {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 8;
        int d = 7;

        if (a < b) {
            if (b < c) {
                if (d > c) {
                    System.out.println(+a + "," + b + "," + c + "," + d);
                } else {
                    if (d > b) {
                        System.out.println(+a + "," + b + "," + d + "," + c);
                    } else {
                        if (d > a) {
                            System.out.println(+a + "," + d + "," + b + "," + c);
                        } else {
                            System.out.println(+d + "," + a + "," + b + "," + c);
                        }
                    }
                }
            }
        } else {
            if (a < c) {
                if (d > b) {
                    System.out.println(+a + "," + c + "," + b + "," + d);
                } else {
                    if (d > c) {
                        System.out.println(+a + "," + c + "," + d + "," + b);
                    } else {
                        if (d > a) {
                            System.out.println(+a + "," + d + "," + c + "," + b);
                        } else {
                            System.out.println(+d + "," + a + "," + c + "," + b);
                        }
                                }
                            }
                        }
                    }
                }
            }
