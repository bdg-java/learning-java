package com.bdg.repetition.from151to190;

public class Task157 {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 100; i < 1000; i++){
            if(i%5 != 0){
                System.out.println("5in voch bazmapatik eranish tiv: " + i);
                sum += i;
            }
        }
        System.out.println("Answer: " + sum);
    }

}
