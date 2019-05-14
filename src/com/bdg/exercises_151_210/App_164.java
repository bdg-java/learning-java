package com.bdg.exercises_151_210;

public class App_164 {
    public static void main(String[] args) {
        int n =87;
        int min = -1;
        for (int i=100;i<1000;i++){
            if(Math.sqrt(i) > n){
                min = i;
                break;
            }
        }
        System.out.println(min);
    }
}
