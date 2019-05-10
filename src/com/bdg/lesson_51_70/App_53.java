package com.bdg.lesson_51_70;

public class App_53 {
    public static void main(String[] args) {
        boolean t;
        int abc = 221;
        int c = abc % 10;
        int a = abc / 100;
        int ab = abc / 10;
        int b = ab % 10;
        int k = a + b + c;
        int dif1 = abc - k;
        int dif2 = c - k;

        if (abc > k) {
            System.out.println(dif1);
        } else {
            System.out.println(dif2);
        }
    }
}
