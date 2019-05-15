package com.bdg;

public class App_151 {
    public static void main(String[] args) {

        int n = 167;
        int sum = 0;


        for (int i = 0; i <= 1000; i++){
            if( i % n == 0){
                sum = sum +i;


                System.out.println(sum);


            }
        }

    }
}