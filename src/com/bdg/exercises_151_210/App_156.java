package com.bdg.exercises_151_210;

public class App_156 {

    public static void main(String[] args) {
        int multiply=1;
        for (int i=10;i<=99;i++){
            if(i%3 == 0 && i%5==0){
                multiply*=i;
            }
        }
        System.out.println(multiply);
    }
}
