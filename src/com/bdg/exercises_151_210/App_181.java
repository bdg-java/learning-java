package com.bdg.exercises_151_210;

public class App_181 {
    public static void main(String[] args) {
        int n = 64;
        for (int i =0;i<=16;i++){
            if(Math.pow(2,i) == n){
                System.out.println(i);
            }
        }
    }
}
