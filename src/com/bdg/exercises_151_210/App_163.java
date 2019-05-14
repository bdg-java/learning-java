package com.bdg.exercises_151_210;

public class App_163 {

    public static void main(String[] args) {
        for (int i=9999;i>1000;i--){
            int square = (int) Math.sqrt(i*18);

            if(Math.pow(square,2) == i*18){
                System.out.println(i);
                break;

            }
        }


        int max = -1;
        for (int i = 1000; i <= 9999; i++) {
            double temp = i * 18;
            if (Math.sqrt(temp) % 2 == 0) {
                max = i;
            }
        }

        System.out.println(max);

    }
}
