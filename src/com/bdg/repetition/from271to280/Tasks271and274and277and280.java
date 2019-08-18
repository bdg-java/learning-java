package com.bdg.repetition.from271to280;

import java.util.Arrays;

public class Tasks271and274and277and280 {

    public static void main(String[] args) {

        int n = 10;
        char[]array = new char[]{'f','d','s','f', 'd', '%', '@', 'd', 'd', 'd'};
        System.out.println("Array is " + Arrays.toString(array));

        //Tasks271
        int quantity = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 'a'){
                quantity++;
            }
        }
        System.out.println("Quantity of element 'a': " + quantity);

        //Task274
        quantity = 0;
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] > 'h') {
                quantity++;
                sum += i;
            }
        }
        System.out.println("'h'ic mets tarreri mijin tvabanakan: " + sum/quantity);

        //Task277
        quantity = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != 'd'){
                quantity++;
            }
        }
        char[]newarray = new char[array.length-quantity];
        int indexd = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != 'd') {
                newarray[indexd] = array[i];
                indexd++;
            }
        }
        System.out.println("Array without element 'd' " + Arrays.toString(newarray));

        //Task280
        quantity = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 'f'){
                quantity++;
            }
        }
        char [] newarr = new char[array.length + quantity];
        int indexf = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 'f'){
                newarr[indexf] = array[i];
                indexf++;
                newarr[indexf] = array[i];
                indexf++;
            }else {
                newarr[indexf] = array[i];
                indexf++;
            }
        }
        System.out.println("Array with double element 'f' " + Arrays.toString(newarr));


    }

}
