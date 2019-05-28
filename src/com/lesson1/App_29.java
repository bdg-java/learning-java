package com.lesson1;

public class App_29 {
    public static void main(String[] args) {
        int a=4566;
        int b=235;
        int c=456;
        if ((a>b)&&(a>c)&& (b>c)){
            System.out.println("a ,b ,c");
        }else {
            if ((b>a)&&(b>c) && (a>c)){
                System.out.println("b, a, c");
            } else{
                if ((a>c)&&(a>b) && (c>b)){
                    System.out.println("a ,c ,b");
                } else{
                    if ((b>c)&&(c>a) && (b>a)){
                        System.out.println("b, c, a");
                    } else {
                        if ((c>a)&&(c>b) && (a>b)) {
                            System.out.println("c, a, b");
                        } else {
                            if ((c>a)&&(c>b) && (b>a)) {
                                System.out.println("c, b, a");

                            }
                        }


                    }

                }


            }
        }
    }
}
