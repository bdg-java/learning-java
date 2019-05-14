package com.bdg.exercises_151_210;

public class App_157 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 100;
        while (i<1000){
            if(i%5 != 0){
                sum+= i;
                i++;
            }
        }
        System.out.println(sum);
    }
}
