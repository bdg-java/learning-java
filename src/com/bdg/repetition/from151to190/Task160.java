package com.bdg.repetition.from151to190;

public class Task160 {

    public static void main(String[] args) {

        for(int i = 100; i < 1000; i++){
            if((Math.sqrt(i*16))%1 == 0){
                System.out.println(i);
                break;
            }
        }
    }

}
