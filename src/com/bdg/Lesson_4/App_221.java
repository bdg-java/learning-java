package com.bdg.Lesson_4;

public class App_221 {
    public static void main(String[] args) {

            int c = -1;
            int d = 12;
            int num = 1;
            int[] x = IntegerArrayoperations.getDefaultArray();

            if (c >= 0 && d <= x.length - 1) {
                for (int i = c; i <= d; i++) {
                    if (x[i] != 0)
                        num *= x[i];
                }
            }
            System.out.println(num);
    }
}
