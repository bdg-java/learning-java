package com.bdg.pastreapeat;

public class App_29 {
    public static void main(String[] args) {
        int a = 9, b = 10, c = 12;
        growthOrderSort(a, b, c);
    }

    public static void growthOrderSort(int... num) {
        int tmp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = num.length-1; j > i ; j--) {
                if (num[i] > num[j]) {
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
            System.out.println(num[i]);
        }
    }
}




