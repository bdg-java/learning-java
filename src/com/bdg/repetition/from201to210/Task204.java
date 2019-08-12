package com.bdg.repetition.from201to210;

public class Task204 {

    public static void main(String[] args) {

        int N = 10790060;

        for(int k = 1; k <= N; k *= 10){
            System.out.print(N/k%10);
        }
    }

}
