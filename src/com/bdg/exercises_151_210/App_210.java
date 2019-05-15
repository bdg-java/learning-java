package com.bdg.exercises_151_210;

public class App_210 {

    public static void main(String[] args) {
        int n = 382;
        boolean t = false;
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 10;true;i*= 10){
            if((n%i/(i/10))%2 != 0){
               sumOdd+=n%i/(i/10);
            }else {
                sumEven+=n%i/(i/10);
            }

            if(n/i == 0 ){
                break;
            }
        }

        if(sumOdd == sumEven){
            t = true;
        }
        System.out.println(t);
    }
}
