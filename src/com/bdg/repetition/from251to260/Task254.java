package com.bdg.repetition.from251to260;

import com.bdg.repetition.from231to250.rs;

public class Task254 {

    public static void main(String[] args) {

        int [] array = rs.buildIntegerArray();
        int max = array[0];
        int min = array[0];

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
