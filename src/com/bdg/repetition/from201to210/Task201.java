package com.bdg.repetition.from201to210;

public class Task201 {

    public static void main(String[] args) {

        int N = 10790060;
        int number = 0;

        for(int i = 1; i <= N; i*=10){
            number++;
        }
        System.out.println(number);
    }

}
