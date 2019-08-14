package com.bdg.repeating;

public class App_151 {
public static void main(String[] args) {
    double a = 0;
    double n = 4;
        double x = 10;

        for(int i =0; i<x; i++) {
            double sum = i / n;
            double number = sum%10*10%10;
            if (number == 0){
                  a += i ;
            }
        }

    System.out.println(a);

    }
}
