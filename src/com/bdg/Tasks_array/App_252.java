package com.bdg.Tasks_array;

public class App_252 {
    public static void main(String args[]){
        int temp;
        int array[] = {10, 20, 25, 3, 96, 57};
       int size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Smallest element of the array is:: "+array[0]);


    }
}
