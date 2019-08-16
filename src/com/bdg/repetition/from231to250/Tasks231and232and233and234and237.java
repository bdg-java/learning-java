package com.bdg.repetition.from231to250;

import java.util.Arrays;

public class Tasks231and232and233and234and237 {

    public static void main(String[] args) {

        int []array = rs.buildIntegerArray();

        int sum = 0;
        int quantity = 0;
        int artadryal = 1;
        int gumar = 0;

        //Tasks 231 and 232 and 233 and 234
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 == 0){
                sum += Math.pow(array[i], 2);
                quantity++;
                artadryal *= array[i];
                gumar += array[i];
            }
        }
        System.out.println("zuyg arzheq unecogh tarreri qarakusiner gumar: " + sum);
        System.out.println("zuyg arzheq unecogh tarreri qanak: " + quantity);
        System.out.println("zuyg arzheq unecogh tarreri artadryal: " + artadryal);
        System.out.println("zuyg arzheq unecogh tarreri gumar: " + gumar);

        //Task 237
        quantity = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                quantity++;
            }
        }
        System.out.println("zro arzheq unecogh tarreri qanak: " + quantity);
    }

}
