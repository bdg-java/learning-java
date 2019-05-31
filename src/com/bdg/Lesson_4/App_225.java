package com.bdg.Lesson_4;

public class App_225 {
    public static void main(String[] args) {
        int t = 5;
        int num = 1;
        int[] arrg = IntegerArrayoperations.getDefaultArray();
        for (int i = 0; i < arrg.length; i++) {
            if (Math.abs(arrg[i]) < t && arrg[i] != 0)
                num *= arrg[i];
        }
        System.out.println(num);
    }
}
