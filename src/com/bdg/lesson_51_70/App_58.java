package com.bdg.lesson_51_70;

public class App_58 {
    public static void main(String[] args) {
        int abc = 111;
        int a = abc / 100;
        int b = (abc % 100) / 10;
        int c = abc % 10;
        int sum = a + b + c;

        if(sum < 5) {
            char f = 'a';
            System.out.println(f);
        } else {
            char f = 'b';
            System.out.println(f);
        }
    }
}
