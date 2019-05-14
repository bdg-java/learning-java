package com.bdg.exercises_151_210;

public class App_154 {
    public static void main(String[] args) {
        int n= 78;
        int multiply = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 2){
                 multiply*=i;
            }
        }
        System.out.println(multiply);
    }
}
