package com.bdg.exercises_151_210;

public class App_209 {

    public static void main(String[] args) {
        int n = 382;
        boolean t = false;
        for (int i = 10;true;i*= 10){
            if((n%i/(i/10))%2 != 0){
                    t = true;
            }

            if(n/i == 0 ){
                break;
            }
        }
        System.out.println(t);
    }
}
