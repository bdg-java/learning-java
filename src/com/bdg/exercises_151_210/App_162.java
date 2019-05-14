package com.bdg.exercises_151_210;

public class App_162 {

    public static void main(String[] args) {
        for (int i=9999;i>1000;i--){
            int square = (int) Math.sqrt(i*14);

            if(Math.pow(square,2) == i*14){
                System.out.println(i);
                break;

            }
        }
    }
}
