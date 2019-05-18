package com.bdg.Tasks_array;

public class App_255 {
    public static void main(String[] args) {
        int array[] = {70, 9, 0, 565, 58460};
        int size = array.length;
        int temp;
        int max = array[0] ;
        int index =0;

        for (int i = 0; i < size; i++) {

                if (array[i] >= max) {
                    max = array[i];
                    index = i;
                }


        }

        System.out.println(index);
    }
}