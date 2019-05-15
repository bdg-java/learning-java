package com.bdg;

public class App_152 {
    public static void main(String[] args) {

        int n = 179;
        int mul = 1;

        for (int  i = 1; i <= 10000; i++){
            if (i % n == 0){
                mul = mul * i;


                System.out.println(mul);

            }
        }
    }
}
