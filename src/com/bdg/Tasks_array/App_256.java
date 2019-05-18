package com.bdg.Tasks_array;

public class App_256 {
    public static void main(String[] args) {
        int index = 0;
        int temp;
        int array[] = {10, 20, 25, 3, 96, 57};
        int max = array[0];
        int size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                if (array[i] >= max) {
                    max = array[i];
                    index = i;
                }

            }
        }
        System.out.println(index);
       // task 256
        System.out.println(index+array[0]);
    }
}
