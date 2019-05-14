package com.bdg.exercises_151_210;

public class App_159 {

    public static void main(String[] args) {
        //too big
        long multiply = 1;
        for (int i=100;i<1000;i++){
            if(i%3 == 1 && i%4 ==2){
                multiply*=i;
            }

        }
        System.out.println(multiply);
    }
}
