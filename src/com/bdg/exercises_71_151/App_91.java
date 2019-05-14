package com.bdg.exercises_71_151;

public class App_91 {


    public static void main(String[] args) {
         double sum =0 ;
         int n = 2;
         for (double x = 1;x<n;x+=0.5){
             sum+= Math.pow(x,2);
         }

        System.out.println(sum);
    }
}
