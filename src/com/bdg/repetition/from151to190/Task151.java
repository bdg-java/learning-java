package com.bdg.repetition.from151to190;

public class Task151 {

    public static void main(String[] args) {

        int n = 166;
        int sum = 0;

        for(int i = n; i > 0; i--){
            if(n%i == 0){
                System.out.println("bnakan tiv, vorin anmnacord bazhanvum e : " + i);
                sum += i;
            }
        }
        System.out.println("Answer: " + sum);
    }

}
