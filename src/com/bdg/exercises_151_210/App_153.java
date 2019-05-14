package com.bdg.exercises_151_210;

public class App_153 {

    public static void main(String[] args) {
        int n= 78;
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 2){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
