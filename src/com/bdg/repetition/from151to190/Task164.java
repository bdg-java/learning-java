package com.bdg.repetition.from151to190;

public class Task164 {

    public static void main(String[] args) {

        int n = 16;

        for(int i = 100; i < 1000; i++){
            if(Math.sqrt(i) > n){
                System.out.println(i);
                break;
            }
        }
    }

}
