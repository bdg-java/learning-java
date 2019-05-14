package com.bdg.exercises_71_151;

public class App_111 {
    public static void main(String[] args) {
        int n =100;
        double x =0;
        for (int i =0;i<n;i++){
            x =x+ Math.pow(x,(4*i) + 1)/((4*i)+1);

        }

        System.out.println(x);
    }
}
