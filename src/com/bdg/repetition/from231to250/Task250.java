package com.bdg.repetition.from231to250;

import java.util.Arrays;

public class Task250 {

    public static void main(String[] args) {

        int [] array = rs.buildIntegerArray();
        int artadryal = 1;

        for (int i = 0; i < array.length; i++){
            if((array[i]*i)%3 == 2){
                artadryal *= Math.pow(array[i],2);
            }
        }
        System.out.println("tarreri qarakusineri artadryal, voronc arzheqneri ev indexneri artadryaly 3i bazhanelis mnacordum mnum e 2: " + artadryal);
    }

}
