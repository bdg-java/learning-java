package com.bdg.lesson_51_70;

public class App_53 {
    public static void main(String[] args) {
        boolean t;
        int abc = 221;
        int c = abc % 10;
        int a = abc / 100;
        int ab = abc / 10;
        int b = ab % 10;
        float k = a + b + c;
        float rel1 = abc / k;
        float rel2 = c / k;

        if (abc > k) {
            System.out.println(rel1);
        } else {
            System.out.println(rel2);
        }
    }
}
