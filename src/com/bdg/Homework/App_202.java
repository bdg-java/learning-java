package com.bdg.Homework;

public class App_202 {
    public static void main(String[] args) {

        int N = 4444;
        int number = 0;

        for(int i = 1; i <= N; i*=10){
            number +=i;
        }
        System.out.println(number);
    }

}
