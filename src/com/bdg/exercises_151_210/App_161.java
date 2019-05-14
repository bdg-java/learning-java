package com.bdg.exercises_151_210;

public class App_161 {

    public static void main(String[] args) {
        for (int i=1000;i<10000;i++){
            int square = (int) Math.sqrt(i*26);

            if(Math.pow(square,2) == i*26){
                System.out.println(i);
                break;

            }
        }
    }
}
