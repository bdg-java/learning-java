package com.bdg.exercises_151_210;

public class App_160 {

    public static void main(String[] args) {
        for (int i=100;i<1000;i++){
            int square = (int) Math.sqrt(i*16);

            if(Math.pow(square,2) == i*16){
                    System.out.println(i);
                    break;

            }
        }

    }
}
