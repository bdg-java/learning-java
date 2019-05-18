package com.bdg.Tasks_array;

public class App_251 {
    public static void main(String[] args) {
        int array [] = {70,9,0,565,50};
        int size = array.length;
        int  temp;
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
        System.out.println(max);

    }
}
