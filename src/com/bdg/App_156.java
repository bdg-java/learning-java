package com.bdg;

public class App_156 {
    public static void main(String[] args) {

        int n = 30;
        int mul = 1;

        for ( int i = 1; i <= 99; i++){
            if ( n % 3 == 0 && n % 5 == 0) {

                mul = mul * i;

                System.out.println(mul);


            }
        }
    }
}
