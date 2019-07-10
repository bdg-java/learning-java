package com.bdg.agharibyan.datastructuresandalgorithm.insertionsort;

public class ArrayInsert {

    private long[] array;
    private int nElement;

    public ArrayInsert(int maxSize){
        array = new long[maxSize];
        nElement = 0;
    }

    public void insert(long value){
        array[nElement] = value;
        nElement++;
    }

    public void display(){
        for (int i = 0; i < nElement; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void insertionSort() {
                                                                                //my code, it doesn't work(
        for(int i = 1; i < nElement; i++){
            long temp = array[i];
            int indexForInsert;
            for(indexForInsert = i; indexForInsert > 0; indexForInsert--){
                if(array[indexForInsert - 1] >= temp){
                    array[indexForInsert] = array[indexForInsert - 1];
                }
            }
            array[indexForInsert] = temp;
        }


//        int in, out;                                                          // true code
//        for (out = 1; out < nElement; out++) {
//            long temp = array[out];
//            in = out;
//            while (in > 0 && array[in-1] >= temp) {
//                array[in] = array[in-1];
//                --in;
//            }
//            array[in] = temp;
//        }

    }
}