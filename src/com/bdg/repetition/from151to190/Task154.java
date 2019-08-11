package com.bdg.repetition.from151to190;

public class Task154 {

    public static void main(String[] args) {

         int n = 177;
         int answer = 1;

         for(int i = n; i > 0; i--){
             if(n%i == 3){
                 System.out.println("bnakan tiv, vorin bazhanelis stanum enq mnacordum 3 : " + i);
                 answer *= i;
             }
         }
        System.out.println("Answer: " + answer);
    }

}
