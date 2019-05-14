package com.bdg.exercises_151_210;

public class App_158 {
    public static void main(String[] args) {
        int multiply = 1;
        for (int i=100;i<1000;i++){
            if(i%2 != 0 && i%3 !=0){
                multiply*=i;
            }
        }
        System.out.println(multiply);
    }
}
