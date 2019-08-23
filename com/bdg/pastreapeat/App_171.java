package com.bdg.pastreapeat;

public class App_171 {
    public static void main(String[] args) {
        factorial(10);

    }

    public static void factorial(int numb) {
        int sum = 1;
        for (int i = 1; i <= numb; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
