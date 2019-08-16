package com.bdg.repetition.from231to250;

public class Task242 {

    public static void main(String[] args) {

        int [] array = rs.buildIntegerArray();
        int m = 5;
        int artadryal = 1;

        for(int i = 0; i < array.length; i++){
            if(array[i]%m == 0){
                artadryal *= array[i];
            }
        }
        System.out.println("5 tvi bazmapatik tarreri artadryal: " + artadryal);
    }

}
