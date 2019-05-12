package com.bdg.lesson_51_70;

public class App_60 {
    public static void main(String[] args) {
        int abc = 957;
        int a = abc / 100;
        int b = (abc % 100) / 10;
        int c = abc % 10;

        if (a > b) {
            if (b > c) {
                System.out.println(a + "," + b + "," + c);
            }
            else if (a > c) {
                System.out.println(a + "," + c + "," + b);
            }
            else {
                System.out.println(c + "," + a + "," + b);
            }
        } else {
            if (b < c) {
                System.out.println(c + "," + b + "," + a);
            }
            else if (a > c){
                System.out.println(b + "," + a + "," + c);
            }
            else {
                System.out.println(b + "," + c + "," + a);
            }
        }

    }
}
