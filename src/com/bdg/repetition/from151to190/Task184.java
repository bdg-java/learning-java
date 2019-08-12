package com.bdg.repetition.from151to190;

public class Task184 {

    public static void main(String[] args) {

        int N = 184;

        for(int k = N/3; k >= 0; k--){
            if(Math.pow(3,k) < N){
                System.out.println(k);
                break;
            }
        }
    }

}
