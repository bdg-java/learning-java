package com.bdg.repetition.from251to260;

import com.bdg.repetition.from231to250.rs;

public class Task251 {

    public static void main(String[] args) {

        int [] array = rs.buildIntegerArray();
        int max = array[0];

        for(int i = 0; i < array.length - 1; i++){
            if(max < array[i+1]){
                max = array[i+1];
            }
        }
        System.out.println("Max: " + max);
    }

}
