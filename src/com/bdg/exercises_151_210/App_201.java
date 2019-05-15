package com.bdg.exercises_151_210;

public class App_201 {
    public static void main(String[] args) {
        int n = 560788;
        int count = 0;
        for (int i = 10;true;i*= 10){
            count++;
            if(n/i == 0){
                System.out.println(count);
                break;
            }
        }
    }
}
