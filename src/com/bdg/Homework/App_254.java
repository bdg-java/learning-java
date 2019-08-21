package com.bdg.Homework;

public class App_254 {
    public static void main(String[] args) {

        int[] array = new int[10];
        int max = array[0];
        int min = array[0];

        array[0] = 2;
        array[1] = 4;
        array[2] = 5;
        array[3] = -6;
        array[4] = 0;
        array[5] = 11;
        array[6] = 44;
        array[7] = 19;
        array[8] = 32;
        array[9] = -66;




        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Max: " + max + ", Min: " + min + ", Max*Min: " + max*min);
    }

}
