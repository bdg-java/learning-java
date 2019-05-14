package com.bdg.exercises_71_151;

public class App_83 {

    public static void main(String[] args) {
        double y;
        double x = - 4.8;
        while (x<= 5.2){
            y = Math.pow(Math.atan(x+1),2.0);
            x+= 0.2;
            System.out.println(y);
        }
    }
}
