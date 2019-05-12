package com.bdg.lesson_51_70;

public class App_67 {
    public static void main(String[] args) {
        int abcd = 8001;
        int a = abcd / 1000;
        int b = (abcd / 100) % 10;
        int c = (abcd % 100) / 10;
        int d = abcd % 10;
        int sum = a + b + c + d;
        int sqr_abcd = sum*sum;

        if(abcd == sqr_abcd) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
