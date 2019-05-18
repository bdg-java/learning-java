package com.bdg.Tasks_array;

public class App_253 {
    public static void main(String[] args) {
        int temp;
        int array[] = {10, 20, 25, 3, 96, 57};
        int size = array.length;
        int sum = 0;
        double max;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        max =array[0];
       // System.out.println(max);
        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }


        System.out.println(max + array[0]);
    }
}
