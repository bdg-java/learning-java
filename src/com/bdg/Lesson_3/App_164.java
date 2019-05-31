package com.bdg.Lesson_3;

public class App_164 {
    public static void main(String[] args) {

            int min = -1;
            int n =21;

            for (int x = 100; x <= 999; x++) {
                if (Math.sqrt(x) > n) {
                    min = x;
                    break;
                }
            }
            System.out.println(min);
    }
}
