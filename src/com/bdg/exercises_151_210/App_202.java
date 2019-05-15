package com.bdg.exercises_151_210;

public class App_202 {

    public static void main(String[] args) {
        int n = 20241;
        int sum = 0;
        for (int i = 10;true;i*= 10){
            sum+= n%i/(i/10);

            if(n/i == 0 ){
                break;
            }
        }
        System.out.println(sum);
    }
}
